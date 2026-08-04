class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = richesperson(accounts);
        return ans;

    }

    int richesperson(int[][] accounts){
        int richest = 0;
        if(accounts.length == 0){
            return 0;
        }

        for(int i =0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                // if(accounts[i][j]>0){
                    sum = sum + accounts[i][j];
                    // richest = sum;
                }

                if(sum > richest){
                    richest = sum;
                }
            }
            return richest;
        }

}