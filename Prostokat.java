public class Prostokat extends Figura{
    private double a, b;
    public Prostokat(){
        this.a = 0;
        this.b = 0;
    }
    public void setA(double a){
        if (a > 0) {
            this.a = a;
        } else System.out.println("Podana wartość jest nieprawidłowa");
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        if (b > 0) {
            this.b = b;
        } else System.out.println("Podana wartość jest nieprawidłowa");
    }
    public double getB(){
        return b;
    }

    @Override
    public double pole() {
        return getA()*getB();
    }

    @Override
    public double obwod() {
        return (2*getA())+(2*getB());
    }
}
