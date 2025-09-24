package array.com;

public class Array_DuplicateCount {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,1,2};
        int result[] = new int[ar.length];
        int index=0;

        for(int i=0;i<ar.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if(ar[i]==result[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                int count=0;
                for(int k=0;k<result.length;k++){
                    if(ar[i]==ar[k]){
                        count++;
                    }
                }
                System.out.println(ar[i]+" = "+count);
                result[index++]=ar[i];
            }
        }
    }
}
