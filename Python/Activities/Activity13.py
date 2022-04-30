	
def sumOfNums(numbers):
	sum = 0
	for num in numbers:
		sum += num
	return sum

list = [10, 20, 30, 50]
result = sumOfNums(list)

print("Sum of all the numbers in the list is --> "+str(result))