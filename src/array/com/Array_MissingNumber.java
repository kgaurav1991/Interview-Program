package array.com;

public class Array_MissingNumber {
    public static void main(String[] args) {
        int ar[] = {1,4,6,7};
        int max = 7;
        for(int i=0;i<ar.length;i++) {
            boolean flag = false;
            for(int num : ar) {
                if(num == i){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(ar[i]);
            }
        }
    }
}
