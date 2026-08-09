class Solution {
    public int splitArray(int[] arr, int m) {

        int start = 0;
        int end  = 0;
        for(int i = 0;i < arr.length;i++){
            start  = Math.max(start,arr[i]);//in the end of the loop this will cointain the max item from the array
            end = end + arr[i];

        }

        //bs
        while(start < end){
            //try fro the middle as potentia ans
            int mid = start + (end -start)/2;
            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){

                    //you cannot add this in this subarruy maker a new one say you add this num in new subarry then sum  = num;
                    sum = num;
                    pieces++;

                }
                else{
                   sum += num;
                }

            }

            if(pieces > m){
                start = mid + 1;
            }
            else{
                end =mid;
            }

        }
        return end;
    }
}