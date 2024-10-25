import { callList } from "./modules/CallList";
import { seats } from "./modules/Seats";

// #### CALL LIST
console.log(callList[0]); // Abner
console.log(callList[2]); // César

// ### SEATS

// ! Onde Júlio está sentado?
console.log(seats[1][1]); // Júlio

// ! Onde Bianca está sentada?
console.log(seats[0][1]); // Bianca

// ! Onde William está sentado?
console.log(seats[1][2]); // William

// ### Operações CallList
callList.push("Zacarias"); // INSERT - Insere no final
callList.unshift("Abner 1"); // INSERT - Insere no começo
console.log(callList[7]); // GET - Zacarias
console.log(callList[0]); // GET - Abner 1
console.log(callList.indexOf("Zacarias")); // 7
console.log(callList);
callList.pop(); // DELETE - Remove o último elemento
callList.shift(); // DELETE - Remove o primeiro elemento
console.log(callList);

callList.splice(2, 0, "Carina"); // INSERT Inserindo no meio do array
console.log(callList); // [ 'Abner', 'Bianca', 'Carina', 'César', 'Fernanda', 'Júlio', 'William' ]

// DELETE
const index = callList.indexOf("Carina");
callList.splice(index, 1);
console.log("CallListArray", callList); // [ 'Abner', 'Bianca', 'César', 'Fernanda', 'Júlio', 'William' ]

// SIZE
console.log(callList.length); // 6

// ### Operações Seats
console.log("### Seats");
// INSERT
seats[1].splice(3, 0, "Zacarias");
console.log(seats[1][3]); // GET - Zacarias
console.log(seats);
// DELETE
seats[1].splice(3, 1);
console.log(seats);
// SIZE
console.log("Size:", seats.length); // 2
console.log("Size:", seats[0].length); // 3
console.log("Size:", seats[1].length); // 3
