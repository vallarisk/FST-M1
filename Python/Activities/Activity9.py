first_list=[2, 3, 6, 7]
second_list=[4, 5, 8, 9]
third_list= []


for num in first_list:
    
    if (num % 2 != 0) :
        third_list.append(num)


for num in second_list:
    if (num % 2 == 0) :
        third_list.append(num)

print("Third list is --> ")
print(third_list)