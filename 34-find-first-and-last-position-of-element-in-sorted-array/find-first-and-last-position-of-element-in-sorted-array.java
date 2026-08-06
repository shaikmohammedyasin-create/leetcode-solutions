class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = FindFirstAndLastPosELe(nums,target);
        return ans;
    }
    //the array ans is taken to retunr vlaues of the index which are storeed in the index
    //here the checking that if the index if 0 is empty or not then intitatiing the program 
    //if the index 0 has got a value by the search funciton then it goes to assign the values int he index of 0,1
    public int[] FindFirstAndLastPosELe(int[] nums,int target){
        int[] ans= {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1){
            ans[1] = search(nums,target,false);
        }


        return ans;

    }

    // this is the fun where we need to find the target and return the true or false so the along with the index values of the array ere the values are stored in the array of the nums not the ans 
    public int search(int[] nums,int target,boolean findstart){

        //assigning the starting index of the start as 0 and end as the length of the nunms so its can these many iteration we need to do 

        int start=0;
        int end = nums.length-1;
        //let the ans be -1 cause it is useed to sotre teh last index of the target value so that is the thing
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(findstart){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }

            }


        }
            return ans;
    }
}