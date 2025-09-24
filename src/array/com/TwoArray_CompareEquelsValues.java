package array.com;

public class TwoArray_CompareEquelsValues {
    public  static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        int arr[] = {4,2};

        for(int j=0;j<ar.length;j++){
            for(int k=0;k<arr.length;k++){
                if(ar[j]==arr[k]){
                    System.out.print(ar[j]+" ");
                }
            }
        }
    }
}
