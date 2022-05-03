public class SubjectForOnlyNewState extends Subject{

   public void setState (int state) {
      if (state == super.state) 
         return;
      super.setState(state);
   }

}