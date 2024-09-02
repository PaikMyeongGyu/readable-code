package cleancode.minesweeper.tobe.cell;

public class NumberCell extends Cell2 {

    private int nearbyLandMineCount;

    public NumberCell(int nearbyLandMineCount) {
        super();
        this.nearbyLandMineCount = nearbyLandMineCount;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return String.valueOf(nearbyLandMineCount);
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
