from ast import While

firstUser = input("Hi! user 1 please enter your name here: ")
secondUser = input("Hi! user 2 please enter your name here: ")

while True:
    firstuserchoice = input(firstUser + ",what do you choose out of rock, paper, scissors? ").lower()
    seconduserchoice = input(secondUser + ",what do you choose out of rock, paper, scissors? ").lower()

    print(firstUser, "selected", firstuserchoice)
    print(secondUser, "selected", seconduserchoice)
    
    if firstuserchoice == "rock" and seconduserchoice !="rock":
        print("Result is: ",firstUser, "wins the game")
    elif seconduserchoice == "rock" and firstuserchoice !="rock":
        print("Result is: ",secondUser, "wins the game")
    elif firstuserchoice == "scissors" and seconduserchoice =="paper":
        print("Result is: ",firstUser, "wins the game")
    elif firstuserchoice == "paper" and seconduserchoice == "scissors":
        print("Result is: ", secondUser, "wins the game")     
    elif firstuserchoice == seconduserchoice:
        print("Result is: Its a tie")
    else:
        print("Invalid input, please try again!")
    
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    if repeat == "yes":
        pass
    elif repeat == "no":
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit