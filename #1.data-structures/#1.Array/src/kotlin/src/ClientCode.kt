import modules.CallList;
import modules.Seats;

fun main(args: Array<String>) {
  val callListArray = CallList().callList;
  val seatsArray = Seats().seats;

  // ### CALL LIST 
  println(callListArray[0]) // Abner
  println(callListArray[4]) // Júlio

  // ### Seats 
  // Onde Júlio está sentado?
  println(seatsArray[1][1]); // Júlio
  // Onde Bianca está sentada?
  println(seatsArray[0][1]) // Bianca
  // Onde William está sentado?
  println(seatsArray[1][2]) // William
}