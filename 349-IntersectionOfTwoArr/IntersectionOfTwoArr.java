public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use Set
        //Set operations:
        //add(), contains()
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> rslt = new HashSet<>();
        
        for (int i = 0; i< nums1.length; i++){
            set1.add(nums1[i]);
        }
        
        for (int i = 0; i< nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                rslt.add(nums2[i]);
            }
        }
        
        //change set to int[]
        int[] intersection = new int[rslt.size()];
        int i = 0;
        for (Integer num : rslt) {
            intersection[i++] = num;
        }
        
        return intersection;

        
    }
}