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
    public double getlenght(){
        return a.getDistanceFromOtherPoint(b);
    }
    public Point getMiddlePoint(){
        return new Point((a.getX()+b.getX())/2,(a.getY()+b.getY())/2);
    }
    public boolean isParalelToTheAxisX(){
        if (a.getY()==b.getY())
            return true;
        else
            return false;
    }
    public boolean isParalelToTheAxisY(){
        return a.getX()==b.getX();
    }
    }
