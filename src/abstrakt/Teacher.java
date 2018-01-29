package abstrakt;

public class Teacher extends Person {
    private double Salry;

    public double getSalry() {
        return Salry;
    }

    public void setSalry(double salry) {
        Salry = salry;
    }

    @Override
    public void info() {
        System.out.println("I am Teacher");
    }

}
