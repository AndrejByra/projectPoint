package sk.akademiasovy.point;

public class Triangel implements interfaceTriangel{
    private Point a;
    private Point b;
    private Point c;

    public Triangel(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }

    public double getSideB(){
        return a.getDistanceFromOtherPoint(c);
    }

    public double getSideC(){
        return a.getDistanceFromOtherPoint(b);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();

    }

    public double getArea(){
        double s=getPerimeter();
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));

    }

    @Override
    public boolean isRectangular() {
        if (getSideA()*getSideA()+getSideB()*getSideB()==getSideC()*getSideC())
            return true;
        else if(getSideA()*getSideA()+getSideC()*getSideC()==getSideB()*getSideB())
            return true;
        else if (getSideB()*getSideB()+getSideC()*getSideC()==getSideA()*getSideA())
            return true;
        else
            return false;
    }

    @Override
    public boolean isEquilateral() {
            if (getSideA()==getSideB() && getSideB()==getSideC()) {
                return true;
            }
            else
                return false;
    }

    @Override
    public boolean isIsosceles() {
        if (getSideA()==getSideB())
            return true;
        else if (getSideA()==getSideC())
            return true;
        else if (getSideB()==getSideC())
            return true;
        else
            return false;

    }
}
