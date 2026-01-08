import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,13,15,17,19};
        System.out.println("Enter the element to be searched:");
        Scanner sc=new Scanner(System.in);
        int result=binarySearch(arr,sc.nextInt());
        if(result!=-1){
            System.out.println("element found at index:"+result);
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
    public static int binarySearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
