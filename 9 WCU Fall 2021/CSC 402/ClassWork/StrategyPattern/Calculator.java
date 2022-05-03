public class Calculator {
   private Strategy strat = null;
   
   public Calculator (Strategy s) {
      strat = s;
   }
   
   public int solve (int x, int y) {
      return strat.calculate(x,y);
   }
}