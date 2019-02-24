public class Move {

    private final int pileIndex;
    private final int numStone;

    public Move(int pileIndex, int numStone) {
        this.pileIndex = pileIndex;
        this.numStone = numStone;
    }

    public int getPileIndex() {
        return pileIndex;
    }

    public int getNumStone() {
        return numStone;
    }
}
