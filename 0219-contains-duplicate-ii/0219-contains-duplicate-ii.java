// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int n =nums.length;
//         for(int i = 0 ;i<n;i++){
//             for(int j = i+1; j < n && j<=i+k; j++){
//                 if(nums[i] == nums[j] && Math.abs(i-j)<=k){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If duplicate already exists within k distance
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Keep only the last k elements
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}