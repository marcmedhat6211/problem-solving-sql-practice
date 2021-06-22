class Solution {
    public int romanToInt(String s) {
//         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
//         map.put('I', 1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);
        
        
        
//         String returnValue = "";
//         for(char c: s.toCharArray()) {
//             returnValue += map.get(c);
//         }
        
//         int sum = 0;
        
//         for(int i = 0; i < returnValue.length(); i++) {
//             char currentCharacter = returnValue.charAt(i);
//             char nextCharacter = '0';
//             if(i != returnValue.length() - 1) {
//                 nextCharacter = returnValue.charAt(i + 1);
//             }
//             int currentNumber = Character.getNumericValue(currentCharacter);
//             int nextNumber = Character.getNumericValue(nextCharacter);
            
//             if(
//                 (currentCharacter == 'I' && nextCharacter == 'X')
//                 || (currentCharacter == 'X' && nextCharacter == 'C')
//                 || (currentCharacter == 'C' && nextCharacter == 'M')
//             ) {
//                 sum = (sum + nextCharacter) - currentCharacter;
//             } else {
//                 sum += currentNumber;
//             }
//         }
        
        
//         return sum;
        
        
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}