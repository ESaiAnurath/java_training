package DAY2;
import java.util.*;
public class tri_perfectNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
            { if(n%i==0){
                 sum+=i;
            }
            }
        if(3*n==sum){
            System.out.println("its a tri perfect number");
        } else{
         System.out.println("its not a triperfect 1 number");
        }
    
}
}