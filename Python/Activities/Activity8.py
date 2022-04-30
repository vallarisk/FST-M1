
from cgi import test


# test_list = ["1","2","3","4","5","6"]
print("Please enter list of 5 numbers: ")
test_list = input(list[5])
if test_list[0] == test_list[-1]:
    print("Result is TRUE")
    print("First and the last number is same")
else:
    print("Result is FALSE")
    print("First and the last number is different")

print("Entered list is "+test_list)