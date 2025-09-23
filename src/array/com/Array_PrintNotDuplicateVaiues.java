package array.com;

public class Array_PrintNotDuplicateVaiues {
    public static void main(String[] args) {
        int ar[] = {1,2,3,1,2,5,6};

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j] && i!=j){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(ar[i]);
            }
        }
    }
}
