package finances;

import java.util.LinkedList;

public class FinanceService {
    final private LinkedList<Finances> finances = new LinkedList<>();

    public void changeProfit(String concertName, int toAdd){
        for(Finances finance : finances){
            if(finance.concertName.equals(concertName)) {
                int profit = finance.getProfit() + toAdd;
                finance.setProfit(profit);
            }
        }
    }

    public void changeExpenses(String concertName, int toAdd){
        for(Finances finance : finances){
            if(finance.concertName.equals(concertName)) {
                int expenses = finance.getExpenses() + toAdd;
                finance.setProfit(expenses);
            }
        }
    }

}
