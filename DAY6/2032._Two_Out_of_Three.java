//2032. Two Out of Three
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
         Set<Integer> s1 = new HashSet<>();
          Set<Integer> s2 = new HashSet<>();
          Set<Integer> s3 = new HashSet<>();
          for(int i=0;i<nums1.length;i++) s1.add(nums1[i]);
          for(int i=0;i<nums2.length;i++) s2.add(nums2[i]);
          for(int i=0;i<nums3.length;i++) s3.add(nums3[i]);
          List<Integer> list = new ArrayList<>();
          for(int val : s1){
            if(s2.contains(val) || s3.contains(val)){
                list.add(val);
            }
            
          }
          for(int val : s2){
            if(s3.contains(val) && !list.contains(val)){
                list.add(val);
            }
          }
      return list;      
}
}