package Arrays;

public class P122_BuyAndSellStock {
	static int [] prices=   {7,1,5,3,6,4};

	public static void main(String[] args) {
		System.out.println("MaxPofit "+maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		//int minPrice=prices[0];
		int maxProfit=0;
		for(int i=0;i<prices.length-1;i++) {
			int profit=0;
			//int j=i+1;
			if(prices[i+1]>prices[i]) {
				profit =prices[i+1]-prices[i];
				maxProfit += profit;
			}
		}
	 return maxProfit;
	
	}
}
