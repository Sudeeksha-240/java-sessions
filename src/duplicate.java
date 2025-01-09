public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        //[2,1,3,1]
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        //brute-force
        //hashset
        //time complexity
        //space complexity
    }
}
