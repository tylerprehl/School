public class Records extends Student
{
   private int [] test = null;
   private int [] quiz = null;
   private int [] assignment = null;
   
   public Records (String name, int tn, int qn, int an, int tw, int qw, int aw)
   {
      super(name, tw, qw, aw);
      test = new int [tn];
      quiz = new int [qn];
      assignment = new int [an];
   }
// The above is fixed and cannot be changed! - I changed the format, but that's all
// Your work starts from here ...

   public void set_test(int[] tests)
   {
      test = tests;
   }
   public void set_quiz(int[] quizzes)
   {
      quiz = quizzes;
   }
   public void set_assignment(int[] assignments)
   {
      assignment = assignments;
   }
   public double get_test()
   {
      int sum = 0;
      double testAvg;
      
      if (test.length != 0)
      {
         for (int i=0; i<test.length; i++)
         {
            sum = sum+test[i];
         }
         testAvg = sum/test.length;
      }
      else
         testAvg = 0;
      return testAvg;
   }   
   
   public double get_quiz()
   {
      int sum = 0;
      double quizAvg;
      
      if (quiz.length != 0)
      {
         for (int i=0; i<quiz.length; i++)
         {
            sum = sum+quiz[i];
         }
         quizAvg = sum/quiz.length;
      }
      else
         quizAvg = 0;
      return quizAvg;
   }
   public double get_assignment()
   {
      int sum = 0;
      double assignmentAvg;
      
      if (assignment.length != 0)
      {
         for (int i=0; i<assignment.length; i++)
         {  
            sum = sum+assignment[i];
         }
         assignmentAvg = sum/assignment.length;
      }
      else
         assignmentAvg = 0;
      return assignmentAvg;
   }
   
   public void grading()
   {
      double[] score = {get_test(), get_quiz(), get_assignment()};
      letter_grading(score);
   }
      
   public String toString()
   {
      String tests = "";
      String quizzes = "";
      String assigns = "";
      
      for (int i = 0; i<test.length; i++)
      {
         if (i==test.length-1)
            tests = tests+test[i]+"]";
         else
            tests = tests+test[i]+", ";
         if (test.length == 0)
            tests = "";
      }
      
      for (int i = 0; i<quiz.length; i++)
      {
         if (i==quiz.length-1)
            quizzes = quizzes+quiz[i]+"]";
         else
            quizzes = quizzes+quiz[i]+", ";
         if (quiz.length == 0)
            quizzes = "";
      }
      
      for (int i = 0; i<assignment.length; i++)
      {
         if (i==assignment.length-1)
            assigns = assigns+assignment[i]+"]";
         else
            assigns = assigns+assignment[i]+", ";
         if (assignment.length == 0)
            assigns = "";
      }
      
      String str = id+"\n";
      if (!tests.equals(""))
         str = str+"Test score: "+"["+tests;
      if (!quizzes.equals(""))
         str = str+"\nQuiz score: "+"["+quizzes;
      if (!assigns.equals(""))
         str = str+"\nAssignment score: "+"["+assigns;
      str = str+"\nGPA: "+get_gpa()+"\n";
      return str;
   }
}