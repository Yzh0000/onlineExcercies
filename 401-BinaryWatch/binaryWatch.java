public class Solution {
    public List<String> readBinaryWatch(int num) {
        /* 1st version
        //00:00-11:59, in total there are 12 * 60 combinations.
        Map<Integer, List<String>> map = new HashMap<>();
        
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                // size is the number of LEDS which are needed for (h,m)
                int size = Integer.bitCount(h) + Integer.bitCount(m);
                List<String> value = map.getOrDefault(size, new ArrayList<String>());
                //format output
                String hmPair = String.format("%d:%02d", h, m);
                value.add(hmPair);
                map.put(size, value);
            }
        }
        
        return map.getOrDefault(num, new ArrayList<String>());
        */
        
        //2nd version: don't need to compute the whole map
        
        List<String> rslt = new ArrayList<>();
        
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h * 64 + m) == num) {
                    rslt.add(String.format("%d:%02d", h, m));
                }
            }
        }
        
        return rslt;
    }
}