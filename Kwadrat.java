public class Kwadrat extends Figura{
    private double a;
    public Kwadrat(){
        this.a  = 0;
    }
    public void setA(double a){
        if (a > 0) this.a = a;
        else System.out.println("Podana wartosć jest nieprawidłowa");
    }
    public double getA(){
        return a;
    }
    @Override
    public double pole(){
        return getA()*getA();
    }
    @Override
    public double obwod(){
        return 4*getA();
    }
}
