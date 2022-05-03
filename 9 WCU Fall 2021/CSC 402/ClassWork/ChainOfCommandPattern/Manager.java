public class Manager extends LeaveHandler {

   public String applyLeave (Leave leave) {
      // Manager can approve over 21 days
      if (leave.getNumberOfDays() > 21) {
         if (leave.getEmpTier() >= 2) {
            if (leave.getReason()!=ReasonType.REGULAR) 
               // Employee tier should be 2 or above to get approved and reason type must be SPECIAL               return "APPROVED by HR";
               return "APPROVED by Manager";
            else
               return "DENIED by Manager: the reason is not Special";
         }
         else
            return "DENIED by Manager: employee tier should be 2 or above to get approved";
      }
      else
         return "we can't give you what you want bro";
   }
}