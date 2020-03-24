import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = input.nextDouble();
        System.out.print("Enter  b : ");
        double b = input.nextDouble();
        System.out.print("Enter  c : ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(a==0){
            System.out.print("Not a Quadratic Equation");
        } else {
            double discriminant = quadraticEquation.getDiscriminant();
            if (discriminant<0){
                System.out.print("No Root");
            } else if (discriminant == 0) {
                System.out.print("X : " + quadraticEquation.getRoot());
            } else {
                System.out.printf("X1 = %-4.3f, ",quadraticEquation.getRoot1());
                System.out.printf("X2 = %-4.3f",quadraticEquation.getRoot2());
            }
        }
    }
}
