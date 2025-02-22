/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

  /**
     * Making boots for the scarecrow
     * @param direction
     * @return the display of the left and right boot
     */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * TODO: Modify this method to print ASCII Art Boot
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.println("Left boot?");
          System.out.println("             |_____|");
        } else if (this.direction.equals("right")) {
          System.out.println("Right boot?");
          System.out.println("             |_____|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
