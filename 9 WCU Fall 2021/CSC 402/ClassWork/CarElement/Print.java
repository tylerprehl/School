public class Print implements Visitor {
   private static Print instance = null;
   
   private Print() {}
   
   public static Print getInstance() {
      if (instance == null)
         instance = new Print();
      return instance;
   }
   
   public void visit(Body b) {
		System.out.println("Body color is " + b.color);
	}

   public void visit(Engine e) {
		System.out.println("Engine color is " + e.color);
	}

   public void visit(Wheel w) {
		System.out.println("Wheel color is " + w.color);
	}
}