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

  ### Operações CallList
  ## INSERT
  print("CallList Operations")
  call_list_array.insert(6, "Zacarias") # Insere no final
  print(call_list_array[6]) # GET | Zacarias
  call_list_array.insert(2, "Carina")  # Insere no meio do array
  print(call_list_array) 
  ## DELETE
  del call_list_array[2]
  del call_list_array[6]
  print(call_list_array) 
  #SIZE
  print(len(call_list_array))

  ### Operações Seats
  print("Seats Operations")
  ## INSERT 
  seats_array[1].insert(3, "Zacarias")
  print(seats_array[1]) # ['Fernanda', 'Julio', 'William', 'Zaricas']
  print(seats_array[1][3]) # GET - Zacarias
  ## DELETE
  del seats_array[1][3];
  print(seats_array) # [['Abner', 'Bianca', 'César'], ['Fernanda', 'Julio', 'William']]
  ## SIZE
  print(len(seats_array)) # 2
  print(len(seats_array[0])) # 3
  print(len(seats_array[1])) # 3

if __name__ == "__main__":
  main()