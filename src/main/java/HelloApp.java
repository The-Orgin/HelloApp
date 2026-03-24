/*
*HelloApp UC3
*
*@author Dhanush
*@version 3.0 
*/

public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0){
            name = args[0];
        }
        
        System.out.println("Hello, " + name + "!");
    }
}