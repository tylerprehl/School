
package housecatalogues;
import java.util.Scanner;

public class House 
{
   private int propertyNumber;
   private String propertyType;
   private int stories;
   private int bedrooms;
   private double marketValue;
   private int investmentYears;
   
   public void display() 
   {
       
   }
    
   public void setPropertyNumber(int newPropNum)
   {
      propertyNumber = newPropNum;
   }
   public void setPropertyNumber(String newPropType)
   {
      propertyType= newPropType;
   }
   public void setStories(int newStories)
   {
      stories = newStories;
   }
   public void setBedrooms(int newBeds)
   {
      bedrooms = newBeds;
   }
   public void setMarketValue(double newMarkValue)
   {
      marketValue = newMarkValue;
   }
}
