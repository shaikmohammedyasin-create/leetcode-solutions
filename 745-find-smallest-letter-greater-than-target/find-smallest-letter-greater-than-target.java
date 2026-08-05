class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char ans = nextGreatestLettermodule(letters,target,start,end);
        return ans;
    }
    char nextGreatestLettermodule(char[] letters,char target,int start,int end){
        // if(letters.length == 0){
        //     return '';
        // }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target >= letters[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return letters[start % letters.length];
    }
}