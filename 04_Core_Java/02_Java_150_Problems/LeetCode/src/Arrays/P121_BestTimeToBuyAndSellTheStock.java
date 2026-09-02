package Arrays;

public class P121_BestTimeToBuyAndSellTheStock {
static int [] prices=   {7,1,5,3,6,4};

public static void main(String[] args) {
	System.out.println("MaxPofit "+maxProfit(prices));
}

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i=0;i<prices.length;i++){
            int j=i+1;
            for (;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit>0){
                    if(maxprofit<profit){
                        maxprofit=profit;
                    }
                }
            }
        }
        return maxprofit;
    }
}

