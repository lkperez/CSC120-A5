/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

  /**
     * Making shirt for the scarecrow
     * @param none
     * @return display of shirt
     */
public class Shirt {

    /*
     * TODO: Modify this method to print ASCII Art Shirt
     */
    public void display() {
        System.out.println("Shirt?");
        System.out.println("                   __,--./|.--,__");
        System.out.println("                .`   \\ \\ / /    `.");
        System.out.println("               .`      \\ | /       `.");
        System.out.println("              /   /     ^|^      \\   \\");
        System.out.println("             /   / |     |o     | \\   \\");
        System.out.println("            /===/  |     |      |  \\===\\");
        System.out.println("           /___/   |     |o     |   \\___\\");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
