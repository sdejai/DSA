package code;

public class BuyandSell {
	    public static int maxProfit(int[] prices) {
	        int maxm=0;
	        int buy=prices[0];
	        for(int i=0;i<prices.length;i++){
	            if(prices[i]<buy){
	                buy=prices[i];
	            }
	            maxm=Math.max(maxm,prices[i]-buy);
	        }
	        return maxm;
	    }
	    public static void main(String[] args) {
	    	int prices[]= {7,6,4,3,1};
	    	System.out.println(maxProfit(prices));
	    }

}
