public class QuadraticEquation {
    private  double a,b,c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4*this.a*this.c;

        return delta;
    }

    double getRoot1(){
        double delta = getDiscriminant();
        double x1 = (-this.b+Math.pow(delta,0.5))/2*this.a;
        return  x1;
    }

    double getRoot2(){
        double delta = getDiscriminant();
        double x2 = (-this.b-Math.pow(delta,0.5))/2*this.a;
        return  x2;
    }
    public double getRoot(){
        double x =(-this.b)/(2*this.a);
        return x;
    }
}
