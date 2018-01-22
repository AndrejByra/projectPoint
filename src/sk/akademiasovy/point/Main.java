package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point (8, 12);
        System.out.println("Point p1 is in "+p1.getQuadrant()+". quadrant");
        Point p2=new Point();
        p2.generateRandomCord();
        System.out.println("Point p2 is in "+p2.getQuadrant()+". quadrant");
        System.out.println("Distance between p1 and p2 is "+p2.getDistance());
        p2.print();
        System.out.println("Distance between p1 and p2 is "+p1.getDistanceFromOtherPoint(p2));

        //3D
        Point3d p31=new Point3d(8, 6, -7);
        Point3d p32=new Point3d();
        p32.generateRandomCord();
        p31.print();
        p32.print();
        System.out.println("Distane between p31 and p32 is "+p31.getDistanceFromOtherPoint(p32));
        Object o1=new Point();
        Point p3=new Point3d(2, 6, 7);

        System.out.println(p3.getDistance());
        Point3d p33=(Point3d)p3;
        //((Point3D) p3).test();

        Geometry g1;
        g1= new Point (5, -9);
        ((Point)g1).print();

        Geometry[] arr=new Geometry[10];
        int i;
        for (i=0; i<10; i++)
        {
            Point3d p=new Point3d();
            p.generateRandomCord();
            arr[i]=p;
        }

        for (Geometry g:arr)
            ((Point3d)g).print();

        Point3d arrPoints[]=new Point3d[10];

        for (i=0;i<10;i++){
            arrPoints[i]=new Point3d();
            arrPoints[i].generateRandomCord();
            arrPoints[i].print();
            System.out.println();
        }

        Point bod15=new Point(2,5);

        Line line1=new Line(bod15, new Point(10,4));
        Line line2=new Line(1,3,4,6);
    }
}