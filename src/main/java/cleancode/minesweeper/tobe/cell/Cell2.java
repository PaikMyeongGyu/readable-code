package cleancode.minesweeper.tobe.cell;

public abstract class Cell2 {

    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGN = "□";

    private int nearbyLandMineCount;
    protected boolean isFlagged;
    protected boolean isOpened;

    public abstract boolean isLandMine();

    public abstract boolean hasLandMineCount();

    public abstract String getSign();

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    // 도메인 지식 규칙에 대한 이해가 필요
    // 게임 종료 조건은 깃발이 달렸냐 열렸냐에 대한 게 아니라
    // 사용자의 행위에 대해 Cell 상태를 변화시키는 방향으로 변화

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }
}
