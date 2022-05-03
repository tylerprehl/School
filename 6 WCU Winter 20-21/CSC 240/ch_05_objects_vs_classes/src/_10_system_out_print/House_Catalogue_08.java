package _10_system_out_print;

// This class tests System.out.print
// Look who it behaves differently based on passing arguemnts

public class House_Catalogue_08 {

    public static void main(String[] args) {

        // Create an objects 
        House tom = new House();
        House jerry = new House();

        // Create a primitive data type
        int age = 25;
        
        // Create a String
        String word = "Temple";
        
        // This is not allowed
       // tom = age;
        
        //This is not allowed 
        //word = age;
        
        //This is not allowed 
        //tom=word;
              
        // Watch out for outputs
        System.out.println(age);
        System.out.println(word);
        System.out.println(tom);
        System.out.println(jerry);
    }
}
