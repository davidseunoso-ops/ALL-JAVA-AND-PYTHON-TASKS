pseudo_code = """
input - number choosen
process - to know if the number choosen is a prime number or not
output - TRUE / FALSE

collect a number from the user
store the number in a container/pointer
if the number can be divisible by only one and itself,
PRINT "TRUE."
if the number can be divided by 2,
PRINT "FALSE."

"""
print(pseudo_code)



prime_number = int(input("Enter the choosen number: "))

if(prime_number % 2 != 0):
    print('TRUE', prime_number, 'is a prime number.')
    
else:
    print('FALSE', prime_number, 'is a not prime number.')
    
