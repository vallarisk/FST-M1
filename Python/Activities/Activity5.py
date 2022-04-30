num = int(input("Please enter a number for which you need the multiplication table: "))

for a in range(1, 11):
    mult = num * a
    print(num, "*", a, "=", mult)