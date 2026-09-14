import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();  

        for (int i = 0; i< nums.length; i++){
            int curr = nums[i];
            int need = target - curr;

            if(map.containsKey(need)){
                return new int[]{
                    map.get(need),
                    i
                };
            }
            map.put(curr, i);
        }      
        return new int[] {};
    }
}