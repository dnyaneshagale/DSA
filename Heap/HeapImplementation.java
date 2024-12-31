package Heap;
import java.util.*;

public class HeapImplementation {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            
            int x = arr.size() - 1;  // Child Index
            int par = (x  - 1)/2; // Parent Index

            while(arr.get(x) < arr.get(par)) {
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek() {
            return arr.get(0);
        }
    }
}
