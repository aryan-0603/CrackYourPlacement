class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int a=0,b=0,c=0,j=0;
        while(j!=(n)){
            if(nums[j]==0)
            a++;
            if(nums[j]==1)
            b++;
            if(nums[j]==2)
            c++;
            j++;
        }
        int iter=0;
        for(int i=0;i<a;i++){
            nums[iter]=0;
            iter++;
        }
        for(int i=0;i<b;i++){
            nums[iter]=1;
            iter++;
        }
        for(int i=0;i<c;i++){
            nums[iter]=2;
            iter++;
        }
    }
}
