package DAY6;
import java.util.Scanner;
public class duizz_buzz {
    public static void main(String[]atgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz"+" ");
            }
            else if(i%3==0){
                System.out.print("Fizz"+" ");
            }
            else if(i%5==0){
                System.out.print("Buzz"+" ");
            }
            else{
                System.out.print(i);
            }

        }
    }
    
}
