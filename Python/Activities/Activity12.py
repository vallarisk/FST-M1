def sum(n):
    if n:
        return n + sum(n-1)
    else:
        return 0
result = sum(10)
print("Sum of digits from 0 to 10 is--> ")
print(result)