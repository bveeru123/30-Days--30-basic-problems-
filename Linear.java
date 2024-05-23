import java.util.*;
public class Linearsearch{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in );
    int [] arr={4,3,6,8,6,1,24,6};
        int key=sc.nextInt();
   int ans=0;
   for(int i=0;i<arr.length;i++)
   {
       if (arr[i]==key)
       {
           ans=i;
           break;
       }
   }
   System.out.println("element found at index: "  +ans);

    }
}
