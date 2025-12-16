package DAY6;
import java.util.*;
class adam_number {
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=(rev*10)+num%10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scan.nextInt();
        int sq=n*n;
        int revofsq=reverse(sq);
        int revnum=reverse(n);
        int sqofrevnum=revnum*revnum;
        
      //  System.out.println("its an adam number");
        if(sqofrevnum==revofsq){
            System.out.println("its an adam number");
        }else{
            System.out.println("its not an adam number");

        }
    }
}