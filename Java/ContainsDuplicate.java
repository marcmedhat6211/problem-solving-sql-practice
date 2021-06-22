class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int num: nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        
        return false;
    }
}

// OTHER SOLUTION
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<Integer>();
        
//         for(int num: nums) {
//             if(set.contains(num)) {
//                 return true;
//             } else {
//                 set.add(num);
//             }
//         }
        
//         return false;
//     }
// }