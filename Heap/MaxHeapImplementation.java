package Heap;
import java.util.*;

public class MaxHeapImplementation {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x  = arr.size() - 1;
            int par = (x - 1)/2;

            while(arr.get(x) > arr.get(par)) {
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        private void heapify(int i) {
            int maxIdx = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left < arr.size() && arr.get(left) > arr.get(maxIdx)) {
                maxIdx = left;
            }

            if(right < arr.size() && arr.get(right) > arr.get(maxIdx)) {
                maxIdx = right;
            }

            if(maxIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);

                heapify(i);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // Swap 1st and Last idx
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Remove last idx
            arr.remove(arr.size() - 1);

            // Heapify
            heapify(0);

            return data;
        }
    }    

    public static void main(String[] args) {
        Heap pq = new Heap(); // Max Heap

        pq.add(2);
        pq.add(5);
        pq.add(3);
        pq.add(4);
        pq.add(1);

        System.out.print("Max Heap -> \n");
        
        while(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
