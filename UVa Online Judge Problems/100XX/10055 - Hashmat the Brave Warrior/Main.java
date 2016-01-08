import java.util.Scanner;

class Main {

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (keyboard.hasNextLong()) {
      long teamA = keyboard.nextLong();
      long teamB = keyboard.nextLong();
      System.out.println((Math.abs(teamA - teamB)));
    }
  }
}
