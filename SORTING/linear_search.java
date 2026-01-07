import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int arr[]={10,25,13,29,94,85,47,68};
        System.out.println("Enter the element to be searched:");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=arr.length;
        for(int i=0;i<=n;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
                break;
            }
        }
        sc.close();
        return;
        
    }
}
