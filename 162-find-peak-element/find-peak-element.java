class Solution {
    public int findPeakElement(int[] arr) {
        int ans = peakindex(arr);
        return ans;
    }
    public int peakindex(int[] arr){
        int start = 0;
        int end = arr.length-1;


        //for traveersing of the arrya we are using the while loop

        while(start < end){
            //formulae for calculating the mid value
            int mid = start + (end - start)/2;

            //here we are checking that in that arrray we if the mid value is greater than next elemetn of the mid value in the arrya then we are in the descending phase so  then we need to assing the end value as the mid so the next part of the areray from the mid is the ascendign phase so then it shift
            
            if(arr[mid] > arr[mid + 1]){
                end = mid;
                
            }
            //else ids used to if the opposite of the above condiiton is then we are in the ascending so we need to assogn the start value as the start = mid + 1 so that menas we are in ascendiing order
            else{
                start = mid + 1;            }
        }
    return start;
}
}