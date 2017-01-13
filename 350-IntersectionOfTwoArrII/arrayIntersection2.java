public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // use a map to count frequencies.
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> rslt = new ArrayList<>();
        
        for (Integer num : nums1) {
            int numFreq = freq.getOrDefault(num, 0);
            freq.put(num, numFreq + 1);
        }
        
        for (Integer num : nums2) {
            int numFreq = freq.getOrDefault(num, 0);
            if (numFreq > 0) {
                rslt.add(num);
                freq.put(num, numFreq - 1);
            }
            
        }
        
        //change rslt to an array
        int[] arr = new int[rslt.size()];
        for (int i = 0; i< arr.length; i++){
            arr[i] = rslt.get(i);
        }

        return arr;
        
        
    }
}