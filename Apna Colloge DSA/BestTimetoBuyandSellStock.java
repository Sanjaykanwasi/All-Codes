
public class BestTimetoBuyandSellStock {
    
    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        int bestBuyPrice = prices[0];

        for(int i=1; i<prices.length; i++){

            if(prices[i] > bestBuyPrice){
                maxProfit = Math.max(maxProfit, prices[i] - bestBuyPrice);
            }
            bestBuyPrice = Math.min(prices[i], bestBuyPrice);
        }

        return maxProfit;
    }
     
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        System.out.println("Maximum profit from stock prices: " + maxProfit(prices));
    }
}
