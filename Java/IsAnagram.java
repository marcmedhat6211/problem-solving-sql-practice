// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) {
//             return false;
//         }
        
//         int[] counts = new int[26];
        
//         for(int i = 0; i < s.length(); i++) {
//             counts[s.charAt(i) - 'a']++;
//             counts[t.charAt(i) - 'a']--;
//         }
        
//         for(int i: counts) {
//             if(i != 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }
// ANOTHER SOLUTION
Class Solution {
    public boolean isAnagram(String s, String t) {
        s.replace(" ", "");
        t.replace(" ", "");

        s = s.toLowerCase();
        t = t.toLowerCase();

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}