package array.com;

import java.util.Arrays;

public class Array_DuplicateRemove {
    public static void main(String[] args) {
        /*
         int ar[] = {1,2,2,1,4,5};
        int arr[] = Arrays.stream(ar).distinct().toArray();
        System.out.println(Arrays.toString(arr));
         */
        int ar[] = {1,2,2,1,4,5};
        int result[] = new int[ar.length];
        int index = 0;

        for(int i=0;i<ar.length;i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (ar[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = ar[i];
            }
        }
            int uniqeArray[] = Arrays.copyOf(result,index);
            System.out.print(Arrays.toString(uniqeArray));

    }
}
