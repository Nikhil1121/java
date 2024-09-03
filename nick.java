import java.util.*;

public class nick{
    public static void main(String[] args) {
        //System.out.println("*\n**\n***\n****");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); 
        int sum=0;
        for(int i = 1; i <= n ;i++){
        sum=sum+i;
           // System.out.println(sum);
        }
        System.out.println(sum);
         
    }
}