"""
Iterative VS Recursive 
some times it is good to use Iterative and some times Recursive 
"""

# ITERATIVE.
def factorial (x):
    result = 1
    if x > 0:
        for i in range (1, x+1):
            result *= i
        print (f"the result of Iterative is: {result}")

# RECURSIVE.
def fact(y):
    if y == 1: # base case 
        return 1
    else:
        return y * fact(y-1) # recursive case


x = int (input("enter the number to perform Iterative function: "))
y = int (input("enter the number to perform Recursive function: "))
factorial(x)
print(f"the result of Iterative is: {fact (y)}")
