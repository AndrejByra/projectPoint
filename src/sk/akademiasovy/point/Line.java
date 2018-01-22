package sk.akademiasovy.point;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public Line(int xa,int ya,int xb,int yb){
     this.a = new Point(xa,ya);
     this.b = new Point(xb,yb);
    }


}
