import java.util.Scanner;

class Main {

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (keyboard.hasNextInt()) {
      int v = keyboard.nextInt();
      int t = keyboard.nextInt();
      int r = (int) ((v*2*t)+(0.5*(5/24)*((2*t)*(2*t))));
      System.out.println(r);
    }
  }
}
