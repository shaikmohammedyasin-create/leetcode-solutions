class Solution {
    public int missingNumber(int[] arr) {
        int ans = missingcyclic(arr);
        return ans;
    }

    public int  missingcyclic(int[] arr){

        //sorting the array using the cyclic sort
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //search for the first missing number in the arry
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }

        //case 2 wher N is not there in array
        return arr.length;
    }

    public void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}