public boolean noTriples(int[] nums) {
  for(int i=0; i<nums.length; i++){
    int first=nums[i];
    if(i+2<nums.length && nums[i+1]==first && nums[i+2]==first)
    return false;
  }
  return true;
}
