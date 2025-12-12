package DAY3;

import java.util.Hashtable;
class majority_lc_169 {
    public int majorityElement(int[] nums) {
      Hashtable<Integer,Integer> frequency = new Hashtable<>();
      for(int i=0;i<nums.length;i++){
        int key = nums[i];
        if(frequency.containsKey(key)){
            frequency.put(key,frequency.get(key)+1);
        }
        else{
            frequency.put(key,1);
        }
        if(frequency.get(key)>nums.length/2){
            return key;
        }
      }
      return -1;
    }
}


