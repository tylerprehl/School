public class Records extends Student{
private int [] test = null;
private int [] quiz = null;
private int [] assignment = null;

public Records (String name, int tn, int qn, int an, int tw, int qw, int aw){
   super(name, tw, qw, aw);
   test = new int [tn];
   quiz = new int [qn];
   assignment = new int [an];
}

   public void set_test(int[] s){
      if(s.length!=test.length) 
      return;
      for(int i = 0; i<test.length; i++){
         test[i] = s[i];
      }
   }
   
   public void set_quiz(int[] s){
      if(s.length!=quiz.length) 
      return;
      for(int i = 0; i<quiz.length; i++){
         quiz[i] = s[i];
      }
   }
   
   public void set_assignment(int[] s){
      if(s.length!=assignment.length) 
      return;
      for(int i = 0; i<assignment.length; i++){
         assignment [i] = s[i];
      }
   }
   
   public double get_test(){
      double total = 0.0;
      if(test.length<=0)
      return 0;
      for(int i = 0; i<test.length; i++)
      total += test[i];
      return total/test.length;
   }
   
   public double get_quiz(){
      double total = 0.0;
      if(quiz.length<=0)
      return 0;
      for(int i = 0; i<quiz.length; i++)
      total += quiz[i];
      return total/quiz.length;
   }
   
   public double get_assignment(){
      double total = 0.0;
      if(assignment.length<=0)
      return 0;
      for(int i = 0; i<assignment.length; i++)
      total += assignment[i];
      return total/assignment.length;
   }
   
   public void grading(){
      double [] tga = {get_test(), get_quiz(), get_assignment()};
      letter_grading(tga);
   }
   
   public String toString(){
      String ret = "";
      ret += get_name()+"\n";
      

      if(get_test()>0)
      ret+="Test score: "+ get_test() +"\n";
      
      if(get_quiz()>0)
      ret+="Quiz score: "+ get_quiz() +"\n";
      
      if(get_assignment()>0)
      ret+="Assignment score: "+ get_quiz() +"\n";


      /*
      if(test.length>0)
      ret+="Test score: "+  +"/n";
      if(quiz.length>0)
      ret+="Quiz score: "+  +"/n";
      if(assignment.length>0)
      ret+="Assignment score: "+  +"/n";
      */
      
      grading();
      ret+="GPA: "+get_gpa()+"\n";
      return ret;
   }
}
