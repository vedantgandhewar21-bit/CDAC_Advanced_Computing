package Arrays;

public class P121_2Method {

static int [] prices=   {7,1,5,3,6,4};

public static void main(String[] args) {
	System.out.println("MaxPofit "+maxProfit(prices));
}

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice=prices[0];
        int price = 0;
        for (int i=1;i<prices.length;i++){
            if(minPrice>prices[i]) {
            	 minPrice=prices[i];
            }
            	int profit = prices[i]-minPrice;
            	
            if(maxProfit<profit) {
            	maxProfit=profit;
            }
           
            	
        } 
        return maxProfit;
    }
}