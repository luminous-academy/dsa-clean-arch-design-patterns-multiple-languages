string[] CallListArray = new CallList().callList;
string[][] SeatsArray = new Seats().seats;

// #### CALL LIST
Console.WriteLine(CallListArray[0]); // Abner
Console.WriteLine(CallListArray[5]); // William

// ### Seats
// Onde Júlio está sentado?
Console.WriteLine(SeatsArray[1][1]); // Julio
// Onde Bianca está sentada?
Console.WriteLine(SeatsArray[0][1]); // Bianca 
// Onde William está sentado?
Console.WriteLine(SeatsArray[1][2]); // William