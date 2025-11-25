void main() {
    for (int i = 0;i<3;i++){
        System.out.println(i);
    }
    int[] nums = {10,20,30};
    for (int j = 0;j<nums.length;j++){
        System.out.println(nums[j]);
    }
    for (int num:nums){
        System.out.println(num);
    }
}