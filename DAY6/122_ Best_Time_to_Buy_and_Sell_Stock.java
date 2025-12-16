//122. Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       // int min = prices[0];
       // int max = 0;
       int profit =0;
        for(int i=1;i<n;i++){
       if(prices[i] > prices[i-1]){
           profit += prices[i] - prices[i-1];
       }
        }
        return profit;
        }
    }
