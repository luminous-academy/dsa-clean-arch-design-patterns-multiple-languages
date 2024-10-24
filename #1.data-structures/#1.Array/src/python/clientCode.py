from modules.Seats import Seats
from modules.Call_List import Call_List

def main():
  seats_instance = Seats()
  call_list_instance = Call_List()

  seats_array = seats_instance.seats
  call_list_array = call_list_instance.call_list

  ### CALL LIST
  print(call_list_array[0]) # Abner
  print(call_list_array[2]) # César

  ## SEATS
  print("## SEATS")
  # Onde Júlio está sentado?
  print(seats_array[1][1])  # Julio
  # Onde Bianca está sentada?
  print(seats_array[0][1]) # Bianca
  # Onde William está sentado?
  print(seats_array[1][2]) # William


if __name__ == "__main__":
  main()