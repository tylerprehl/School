public class Main {
   public static void main (String[] args) {
      TeamLeader teamLeader = new TeamLeader ();
      ProjectLeader projectLeader = new ProjectLeader();
      HR hr = new HR();
      Manager manager = new Manager();
      
      teamLeader.setSuperVisor(projectLeader);
      projectLeader.setSuperVisor(hr);
      hr.setSuperVisor(manager);
      
      Leave leave1 = new Leave (22, 3, ReasonType.CRITICAL);
      System.out.println(teamLeader.applyLeave(leave1));
   }
}