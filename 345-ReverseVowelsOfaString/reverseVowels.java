public class Solution {
    public String reverseVowels(String s) {
        //two pointer
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int i = 0, j = arr.length - 1;
        while(i < j) {
            //1st version
            // if (!set.contains(arr[i])) i++;
            // if (!set.contains(arr[j])) j--;

            // if (set.contains(arr[i]) && set.contains(arr[j])) {
            //     char temp = arr[i];
            //     arr[i] = arr[j];
            //     arr[j] = temp; 
            //     i++;
            //     j--;
            // }
            //2nd version:
            while(i < j && !set.contains(arr[i])) i++;
            while(i < j && !set.contains(arr[j])) j--;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        
        return new String(arr);
        
    }
}