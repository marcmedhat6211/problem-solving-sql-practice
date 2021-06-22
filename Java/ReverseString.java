class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}

// OTHER SOLUTION
// class Solution {
//     public sTRING reverseString(String s) {
//         char[] characters = s.toCharArray();
//         int left = 0;
//         int right = s.length() - 1;
        
//         while(left < right) {
//             char temp = characters[left];
//             characters[left++] = characters[right];
//             characters[right--] = temp;
//         }

//         return new String(Characters);
//     }
// }