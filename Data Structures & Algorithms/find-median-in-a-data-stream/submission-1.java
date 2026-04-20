class MedianFinder {

    PriorityQueue<Integer> rightQueue = new PriorityQueue<>();
    PriorityQueue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        leftQueue.offer(num);
        rightQueue.offer(leftQueue.poll());
        if(rightQueue.size()>leftQueue.size()) {
            leftQueue.offer(rightQueue.poll());
        }
    }
    
    public double findMedian() {
        if(leftQueue.size()>rightQueue.size()) {
            return leftQueue.peek();
        } else {
            return (leftQueue.peek() + rightQueue.peek()) /2.0;
        }
    }
}
