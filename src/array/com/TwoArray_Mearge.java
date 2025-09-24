package array.com;

public class TwoArray_Mearge {
    public static void main(String[] args) {
        int ar[] = {1,2};
        int arr[] = {3,4,5,};
        int size=ar.length+arr.length;
        int result[] = new int[size];

        for(int i=0;i<ar.length;i++){
            result[i]=ar[i];
        }
        for(int i=0;i<arr.length;i++){
            result[i+ar.length]=arr[i];
        }
        for(int num : result){
            System.out.print(num);
        }
    }
}
