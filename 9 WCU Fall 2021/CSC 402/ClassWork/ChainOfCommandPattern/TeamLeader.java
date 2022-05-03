public class TeamLeader extends LeaveHandler {
      
   public String applyLeave (Leave leave) {
      // Team Lead can approve up to 7 days, otherwise passed to Proj Lead
      if (leave.getNumberOfDays() <= 7) {
         if (leave.getEmpTier() >= 4)
            // Employee tier should be 4 or above to get approved
            return "APPROVED by Team Leader";
         else
            return "DENIED by Team Leader: employee tier should be 4 or above to get approved";
      }
      else
         return superVisor.applyLeave(leave);
   }
}