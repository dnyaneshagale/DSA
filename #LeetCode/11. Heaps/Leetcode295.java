package #LeetCode.11. Heaps;

class MedianFinder {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek() >= num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        if(maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.remove());
        } else if(maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.remove());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }

        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
