public class ProjectLeader extends LeaveHandler {
   
   public String applyLeave (Leave leave) {
      // Proj Lead can approve up to 14 days, otherwise passed to HR
      if (leave.getNumberOfDays() <= 14) {
         if (leave.getEmpTier() >= 3)
            // Employee tier should be 3 or above to get approved
            return "APPROVED by Project Leader";
         else
            return "DENIED by Project Leader: employee tier should be 3 or above to get approved";
      }
      else
         return superVisor.applyLeave(leave);
   }
}