// Beats - 12%
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> myList = new ArrayList<>();
        double median = 0;

        for (int a : nums1){
            myList.add(a);
        }

        for (int b : nums2){
            myList.add(b);
        }

        Collections.sort(myList);
        int size = myList.size();

        if (size%2==0){
            median = (myList.get((size/2)-1) + myList.get(size/2)) / 2.0;
        }else{
            median = myList.get((size)/2);
        }

        return median;
    }
}
