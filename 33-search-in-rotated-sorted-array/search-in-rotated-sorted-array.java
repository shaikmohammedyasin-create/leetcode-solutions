class Solution {
    public int search(int[] arr, int target) {
        int pivot = findpivot(arr);
        //if the pivot is -1 then array doesnot have the target value
        if(pivot == -1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        //if the target and pivot is equal then pivot is required value
        if(arr[pivot] == target){
            return pivot;
        }
        //if the target is teh grater than the index of 0 in the array arr then we arein teh ascending of the left side array till pivot 
        if(target >= arr[0]){
            return binarysearch(arr,target,0,pivot);
        }
        //if the target is the less than the index of the of the 0th index of then we need to move to the right side of the arrya then that will eb the pivot + 1 and end 
        else{
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
    }
        //finding the pivot 
        public int findpivot(int[] arr){
            int start = 0; //searching from the 0th 
            int end = arr.length-1;// to the end of the array
            while(start <= end){
                //calcualtiong the mid value
                int mid = start +(end - start )/2;
                //checking that if the array doeesnot indexoutbound is the frist condiiton and the second condition is the if the mid value is greater than the next vlaue of the mid value then we are in the first phase of the ascendingorder os the returning mid value
                if(mid < end && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                //chekciing that the mid vlaue is greayer than start so cause the first condition is in teh left pahse of the ascending order so here the array will shifted to the right side of the array in ascending order
                if(mid > start && arr[mid] < arr[mid -1 ]){
                    return mid -1;
                }
                //if the mid vlaye is greater than the start vlaeu then we are moving the end pint to the left side of the asc array 
                if(arr[mid] <= arr[start])
                {
                    end = mid -1;
                }
                else{
                    //if false then we move the start index to the right sideo of the array
                    start = mid + 1;
                }
            }
            return -1;
        }


        public int binarysearch(int[] arr,int target,int start,int end){
            while(start <= end){
                int mid = start+(end - start)/2;
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else if(arr[mid] > target){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
            return -1;
    }
}