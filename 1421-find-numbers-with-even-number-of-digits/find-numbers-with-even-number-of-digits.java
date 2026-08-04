class Solution {
    public int findNumbers(int[] nums) {
        int evendigitcount = findeven(nums); 
        return evendigitcount;
        }


    static int findeven(int[] nums){
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(counteven(nums[i])){
                count++;
            }

        }
        return count;



    }

    static boolean counteven(int countnumbers){
        int Numberofdigits = digits(countnumbers);
        if(Numberofdigits % 2 == 0 )
        {
            return true;
        }
        return false;
    }

    static int digits(int countnumbers){
        int count = 0;
        while(countnumbers>0){
            countnumbers = countnumbers/10;
            count++;
        }
        return count;
    }

}
