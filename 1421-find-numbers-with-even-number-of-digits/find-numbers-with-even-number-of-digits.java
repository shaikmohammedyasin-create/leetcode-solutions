class Solution {
    public int findNumbers(int[] nums) {
        int ans = findeven(nums);
        // System.out.println(ans);
        return ans;
    }

    static int findeven(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(evenn(nums[i])){
                count++;
            }

        }
        return count;


    }

    static boolean evenn(int number){
        int NumbEven = digits(number);
        int Evee = NumbEven % 2;
        if(Evee==0){
            return true;
        }
        return false;
    }

    static int digits(int number){
        int count = 0;
        while(number > 0){
        
        number = number/10;
        count++;

        }

        return count;

    }
}

