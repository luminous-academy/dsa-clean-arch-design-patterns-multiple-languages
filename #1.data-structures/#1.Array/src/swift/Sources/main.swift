// The Swift Programming Language
// https://docs.swift.org/swift-book

public struct clientCode {
  public static func main() {
    let callListArray = CallList().callList
    let seatsArray: [[String]] = Seats().seats

    // #### CALL LIST
    print(callListArray[0]) // Abner
    print(callListArray[5]) // William

    // #### Seats
    // Onde Júlio está sentado?
    print(seatsArray[1][1]) // Júlio
    // Onde Bianca está sentada?
    print(seatsArray[0][1]) // Bianca
    // Onde William está sentado?
    print(seatsArray[1][2]) // William
  }
}

clientCode.main()
