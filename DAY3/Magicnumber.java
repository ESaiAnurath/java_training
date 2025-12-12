package DAY3;
import java.util.*;
public class Magicnumber {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in); // Corrected variable name to
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        int sum = 0;
        while(num>0){
            if(num%2==0){
                sum++;
            }
            else{
                sum +=2;
            }
           num/=2;
        }
        System.out.println(sum);
        if(sum%2 != 0){
            System.out.println("its a magic number");
        }
        else{
            System.out.println("not a magic");
        }
    }
}

