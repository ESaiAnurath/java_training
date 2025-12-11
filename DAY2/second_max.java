package DAY2;
import java.util.*;
public class second_max {

	public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int arr[]= new int[5];
            System.out.println("enter 5 numbers:");
            for(int i=0;i<5;i++){
                arr[i]= scn.nextInt();
            }
            
	//int arr[]={69,90,45,100,67};
	int max= arr[0];
	int second_max = -1;
	
	for(int i=0;i<arr.length;i++){
	    if(arr[i]>max){
	        second_max = max;
	        max =arr[i];
	    }
	    else if(arr[i]>max && arr[i] != max){
	        second_max = arr[i];
	    }
	    
	}
	System.out.println("second max = "+second_max);
	
	}
}

