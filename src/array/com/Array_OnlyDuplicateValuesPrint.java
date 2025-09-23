package array.com;

public class Array_OnlyDuplicateValuesPrint {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,1,2};
        int temp[] = new int[ar.length];
        int index = 0;

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(ar[i]==temp[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
               continue;
            }
            int count=0;
            for(int j=0;j<temp.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(ar[i]);
                temp[index++]=ar[i];
            }
        }
    }
}
