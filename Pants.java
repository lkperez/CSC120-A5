/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

 /**
     * Making pants for the scarecrow
     * @param none
     * @return display of pants
     */
public class Pants {

    /*
     * TODO: Modify this method to print ASCII Art Pants
     */
    public void display() {
        System.out.println("Pants?");
        System.out.println("              |___/\\___|");
        System.out.println("              | | \\/ | |");
        System.out.println("              |_/ || \\_|");
        System.out.println("              |   ||   |");
        System.out.println("              |   ||   |");
        System.out.println("              |   ||   |");
        System.out.println("              |   ||   |");
        System.out.println("              |   ||   |");
        System.out.println("              |___||___|");
        
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
