package sk.akademiasovy.point;

public class Point3d extends Point {
    int z;

    public int getZ() {
        return z;
    }

    public Point3d() {
        z=0;
    }

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()*getY()*getY());
    }

    @Override
    public void generateRandomCord() {
        super.generateRandomCord();
    }

}
