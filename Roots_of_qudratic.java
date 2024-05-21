import java.util.Scanner;

public class Roots_of_qudratic {
    public static void main(String args[]){
        double r1,r2;
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=(b*b)-(4*a*c);
        if(d==0) {
            System.out.println("real and  equal");
            r1 = r2 = -b / (2 * a);
            System.out.println("R1=" + r1 + "R2=" + r2);
        } else if (d>0) {
            System.out.println("real and distinct");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("R1="+r1+"R2="+r2);
        }
        else{
            System.out.println("roots are distinct and imaginery");
            double x=-b/(2*a);
            double y=Math.sqrt(-d)/(2*a);
            System.out.println("R1="+x+"+i"+y);
            System.out.println("R2="+y+"-i"+y);
        }
    }
}
