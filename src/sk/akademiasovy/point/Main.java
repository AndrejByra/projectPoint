package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5,12);
        System.out.println("Point1 is in  " + point1.getQuadrant() + " Quadrant");

        Point point2 = new Point();
        point2.generateRandomCord();
        System.out.println("Point2 is in  " + point2.getQuadrant() + " Quadrant");
        point2.print();
        System.out.println("Distance between Point1 and Point2 " + point1.getDistanceFromOtherPoint(point2));
    }
}
