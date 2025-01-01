package Heap;
import java.util.*;

public class MinHeapImplementation {
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

        private void heapify(int i) {
            int minIdx = i;   //Say
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                //Swap
                int temp = arr.get(i);
                arr.set(0, arr.get(minIdx));
                arr.set(minIdx,  temp);

                heapify(minIdx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            //Step 1 => 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 => 
            arr.remove(arr.size() - 1);

            //Step 3 =>
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
}
