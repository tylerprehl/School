public class HR extends LeaveHandler {
   
   public String applyLeave (Leave leave) {
      // HR can approve up to 21 days, otherwise passed to Manager
      if (leave.getNumberOfDays() <= 21) {
         if (leave.getEmpTier() >= 3) {
            if (leave.getReason()!=ReasonType.REGULAR) 
               // Employee tier should be 3 or above to get approved and reason type cannot be REGULAR
               return "APPROVED by HR";
            else
               return "DENIED by HR: the reason is Regular";
         }
         else
            return "DENIED by HR: employee tier should be 3 or above to get approved";
      }
      else
         return superVisor.applyLeave(leave);
   }
}