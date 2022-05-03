// Visitor is a singleton class (there is only ONE instance that
// can ever be created)

// It is also a Visitor class (hence the name)

public class Visitor {
   private static Visitor instance = null;
   
   private Visitor() {
      // 
   }
   
   public static Visitor getInstance() {
      if (instance == null) 
         instance = new Visitor();
      return instance;
   }
   
   public static void draw(Circle c) {
		System.out.println("draw() in Circle");
	}

   public static void draw(Square s) {
		System.out.println("draw() in Square");
	}   
   
   public static void draw(Triangle t) {
		System.out.println("draw() in Triangle");
	}
}