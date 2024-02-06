public class Kolo extends Figura{
    private double r;
    public Kolo() {
        this.r = 0;
    }
    public void setR(double r) {
        if (r > 0) this.r = r;
        else System.out.println("Podana wartość jest nieprawidłowa");
    }
    public double getR(){
        return r;
    }
    @Override
    public double pole(){
        return Math.pow(getR(), 2)*Math.PI;
    }
    @Override
    public double obwod(){
        return 2*getR()*Math.PI;
    }
}
