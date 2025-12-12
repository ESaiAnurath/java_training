package DAY3;
import java.util.*;
class mergearray_lc_88 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int m = scn.nextInt();
        System.out.println("Enter size of second array:");
        int n = scn.nextInt();
        int[] nums1 = new int[m + n];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<m;i++){
            nums1[i] = scn.nextInt();
        }
        int[] nums2 = new int[n];
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++){
            nums2[i] = scn.nextInt();
        }
        mergearray_lc_88 obj = new mergearray_lc_88();
        obj.merge(nums1,m,nums2,n);
        System.out.println("Merged array:");
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i] + " ");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k= m+n -1;
        while(j>=0 && i>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i=i-1;
            }
            else{
                nums1[k] = nums2[j];
                j=j-1;
            }
            k=k-1;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j=j-1;
            k=k-1;
        }
    }
}

