package DAY2;
import java.util.*;
public class gcd {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println("the numbers are:"+n1+" "+n2);
        int factor=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                factor=i;
            }
        }
        System.out.println("gcd is:"+factor);
    }
    
}
