public class Repair implements Visitor {
   private static Repair instance = null;
   
   private Repair() {}
   
   public static Repair getInstance() {
      if (instance == null)
         instance = new Repair();
      return instance;
   }
   
   public void visit(Body b) {
		System.out.println("Body was repaired in " + b.year);
	}
   
   public void visit(Engine e) {
		System.out.println("Engine was repaired in " + e.year);
	}
   
   public void visit(Wheel w) {
		System.out.println("Wheel was repaired in " + w.year);
	}
}