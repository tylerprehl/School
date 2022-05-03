public class TestScores
{
   private double test1;
   private double test2;
   private double test3;
   
   public TestScores(double test1, double test2, double test3)
   {
      this.test1=test1;
      this.test2=test2;
      this.test3=test3;
   }
   
   public TestScores(int[] tests)
   {
      test1 = tests[0];
      test2 = tests[1];
      test3 = tests[2];
   }
   
   public double getAvg()
   {
      double avg = (test1+test2+test3)/3;
      return avg;
   }
   
   public int compareTo(TestScores x)
   {
      if ((test1+test2+test3)/3>x.getAvg())
         return 1;
      else if ((test1+test2+test3)/3==x.getAvg())
         return 0;
      return -1;
   }
   
   public String toString()
   {
      return ""+(test1+test2+test3)/3;
   }
}