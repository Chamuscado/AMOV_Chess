package Chess;

public class CoordV2 {
    protected int X,Y;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public CoordV2(int x, int y) {
        X = x;
        Y = y;
    }
    public CoordV2(Coord cord) {
        X = cord.getLetAsInd();
        Y = cord.getNumbAsInd();
    }
}
