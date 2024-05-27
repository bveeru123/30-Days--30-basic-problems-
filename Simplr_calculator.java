import java.util.Scanner;

public class Simplr_calculator {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        double num1=sc.nextInt();
        double num2=sc.nextInt();
        System.out.println("select operators :\n 1.Addition + \n 2.Subtraction - \n 3.Multiplication * \n 4.Division / \n");
        System.out.println("Enter operator");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                if(num2!=0) {
                    System.out.println(num1 / num2);
                }
                else{
                    System.out.println("Error Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
