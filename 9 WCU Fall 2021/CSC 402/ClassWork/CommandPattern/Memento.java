import java.util.Stack; 

// MEMENTO PATTERN (for undoing/redoing)

public class Memento {
   
   private static Stack<Order> past = new Stack<Order>();
   private static Stack<Order> future = new Stack<Order>();
   
   public static Order add(Order o) {
      past.add(o);
         return o; // THIS is what makes it okay for this to be inside the takeOrder call in Main
   }
   
   public static void redo() {
      if (!future.empty()) {
         Order o = future.pop();
         o.redo();
         past.push(o);
      }
   }
   
   public static void undo() {
      if (!past.empty()) {
         Order o = past.pop();
         o.undo();
         future.push(o);
      }
   }
   
}