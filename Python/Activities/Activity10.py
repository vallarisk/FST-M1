test_tuple = (5, 12, 15, 24, 30)
# (5, 12, 15, 24, 30, 35)
# (5, 10, 12, 13, 50)
print("Number of the tuple which are divisible by 5 --> ")
for num in test_tuple:
    if (num%5 == 0):
        print(num)