public class Car
{
   private int yearModel;
   private String make;
   private int speed;
   
   public Car(int carYearModel, String carMake, int carSpeed)
   {
      yearModel = carYearModel;
      make = carMake;
      speed = carSpeed;
   }
   
   public void accelerate()
   {
      speed+=5;
   }
   
   public void brake()
   {
      if (speed>4)
         speed-=5;
      else
         speed-=speed;
   }
   
   public String toString()
   {
      return make+yearModel+"(now...at speed of "+speed+")";
   }
}