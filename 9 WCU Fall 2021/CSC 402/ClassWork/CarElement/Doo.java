public class Doo implements Visitor {
   private static Doo instance = null;
   
   private Doo() {}
   
   public static Doo getInstance() {
      if (instance == null)
         instance = new Doo();
      return instance;
   }
   
   public void visit(Body b) {
		System.out.println("Body does " + b.role);
	}
   
   public void visit(Engine e) {
		System.out.println("Engine does " + e.role);
	}
   
   public void visit(Wheel w) {
		System.out.println("Wheel does " + w.role);
	}
}