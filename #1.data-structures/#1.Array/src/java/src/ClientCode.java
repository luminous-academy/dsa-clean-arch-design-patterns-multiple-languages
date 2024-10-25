import modules.CallList;
import modules.Seats;

public class ClientCode {
  public static void main(String[] args) {
    String[] callList = new CallList().callList;
    String[][] seats = new Seats().seats;

    // # CALL LIST
    System.out.println(callList[0]); // Abner
    System.out.println(callList[5]); // William

    // # Seats
    // Onde júlio está sentado?
    System.out.println(seats[1][1]); // Júlio
    // Onde Bianca está sentada
    System.out.println(seats[0][1]); // Bianca
    // Onde William está setando?
    System.out.println(seats[1][2]); // William
  }
}