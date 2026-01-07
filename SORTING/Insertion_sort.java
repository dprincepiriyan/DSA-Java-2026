public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={64,34,25,12,11,22,90,5};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int insertIndex=i;
            int insertValue=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>insertValue){
                arr[j+1]=arr[j];
                insertIndex=j;
                j--;
            }
            arr[insertIndex]=insertValue;
        }
        System.out.println("Insertion Sort has been achieved:");
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
        
    }
}
