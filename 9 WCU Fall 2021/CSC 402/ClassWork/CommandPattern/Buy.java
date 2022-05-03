// COMMAND PATTERN (turn a dynamic method into static information for use as param)

public class Buy implements Order {
   
   private String tickerSymbols;
   private int quantity;
   private Broker b;
   
   public Buy (String tickerSymbols, int quantity, Broker b) {
      this.tickerSymbols = tickerSymbols;
      this.quantity = quantity;
      this.b = b;
   }
   
   public void execute() {
      b.buy(tickerSymbols, quantity);
   }
   
   public void undo() {
      b.sell(tickerSymbols, quantity);
   }
   
   public void redo() {
      this.execute();
   }

}