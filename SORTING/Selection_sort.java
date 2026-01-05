public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={64,34,21,30,11,90};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int min_value=arr[min_index];
            for(int k=min_index;k>i;k--){
                arr[k]=arr[k-1];

            }
            arr[i]=min_value;
        }
        System.out.println("Selection Sort has been achieved:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
