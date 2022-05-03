public class ArrayTest{
public static void main(String args[]){
   MyArray a = new MyArray();
   MyArray b = a;
   System.out.println(a);
   a.remove(); // Should not incur any exception.
   System.out.println("Size:"+a.size());
   System.out.println("[0]:"+a.element(0));
   System.out.println("add(1, 1):"+a.add(1,1));
   System.out.println("set [0] by 1.");
   a.set(0,1); // No exception even there is no element.
   System.out.println(a);
   System.out.println(a.indexOf(1));
   System.out.println("add(0, 1):"+a.add(0,1));
   System.out.println("[0]:"+a.element(0));
   System.out.println(a);
   System.out.println(a.size());
   a.clear();
   System.out.println(a);
   a.add(1);
   System.out.println("add(2,2):"+a.add(2, 2));
   System.out.println("add(1,3):"+a.add(1, 3));
   System.out.println("add(0,4):"+a.add(0, 4));
   a.add(5);
   System.out.println(a);
   System.out.println("indexOf(4):"+a.indexOf(4));
   a.remove();
   System.out.println("indexOf(4):"+a.indexOf(4));
   System.out.println(b); // Not a!
   System.out.println("[size-1]:"+b.element(b.size()-1));    
  }
}