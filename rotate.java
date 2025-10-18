class Solution {
    public void rev(int[] nums,int a, int b){
        while(a<=b){ 
            int temp=nums[a];
            nums[a] = nums[b]; 
            nums[b]=temp;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        int rot=nums.length-k;
        int i=0;
        int j=rot-1;
        int x=rot;
        int y=nums.length-1;
        if(nums.length==1)
            return;
        rev(nums , i ,j);
        rev(nums , x , y);
        rev(nums,0,nums.length-1);
    }
}
