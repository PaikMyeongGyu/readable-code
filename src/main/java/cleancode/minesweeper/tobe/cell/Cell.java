package cleancode.minesweeper.tobe.cell;

public interface Cell {

    String FLAG_SIGN = "⚑";
    String UNCHECKED_SIGN = "□";

    boolean isLandMine();

    boolean hasLandMineCount();

    String getSign();

    void flag();

    void open();

    // 도메인 지식 규칙에 대한 이해가 필요
    // 게임 종료 조건은 깃발이 달렸냐 열렸냐에 대한 게 아니라
    // 사용자의 행위에 대해 Cell 상태를 변화시키는 방향으로 변화

    boolean isChecked();

    boolean isOpened();

}
