import java.util.Scanner;

class Main {

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (keyboard.hasNextInt()) {
      int numberOfCases = keyboard.nextInt();

      for (int i = 0; i < numberOfCases; i++) {
        int firstInput = keyboard.nextInt();
        int secondInput = keyboard.nextInt();
        
        if (firstInput < secondInput) {
          System.out.println("<");
        } else if (firstInput > secondInput) {
          System.out.println(">");
        } else {
          System.out.println("=");
        }
      }
    }
  }
}
