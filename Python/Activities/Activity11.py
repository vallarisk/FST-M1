fruits_dictionary = {
    "Banana": 5,
    "Mango": 100,
    "Apple": 20,
    "Kiwi": 60,
    "Pear": 35,
    "Guava": 20
}

fruitToSearch = input("Which fruit do you want?")

for fruit in fruits_dictionary:
    if fruit == fruitToSearch:
        print(fruit+" is available")
   