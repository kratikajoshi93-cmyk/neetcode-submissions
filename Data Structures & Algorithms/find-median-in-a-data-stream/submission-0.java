class MedianFinder {

    List<Integer> list = new ArrayList();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        int result = 0;
        Collections.sort(list);
        if(list.size()%2==0) {
            int index = list.size()/2;
            result = list.get(index)+list.get(index-1);
            return Double.valueOf(result/2.0);
        } else {
            int size = list.size();
            return Double.valueOf(list.get(size/2));
        }
    }
}
