import java.util.Scanner;
public class Perfect_square {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n==i*i)
            {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("PERFRCT SQUARE");
        }
        else{
            System.out.println("NOT A PERFECT SQUARE");
        }
    }
}
