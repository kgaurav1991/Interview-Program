package collection.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array_Sort_UsingCollection {
    public static void main(String[] args) {
        int ar[] = new int[]{4,2,5,1};

        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<ar.length;i++){
            set.add(ar[i]);
        }
        System.out.println(set);
    }
}
