def createFibbonaci(n):
    
    if n<=1:
        return n 
    else:
        return (createFibbonaci(n-1) + createFibbonaci(n-2))
        
nterms = int(input("Enter a number: ")) 
	
if nterms <= 0:
	
    print("Please enter a positive number")
	
else:
	
    print("Fibonacci Sequence: ")
	
    for i in range(nterms):
	
        print(createFibbonaci(i))