import java.util.Scanner;
public class Even_odd {
    public static void main(String arsg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is a Even number");
        }
        else{
            System.out.println(n+" is Odd number");
        }
    }
}
