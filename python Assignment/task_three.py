pseudo_code = ("""
input - number choosen
process - to know if the number choosen is an even number or not
output - TRUE / FALSE

collect a number from the user
store the number in a container/pointer
if the number is divisible by 2,
PRINT "TRUE."
if the number is not divisible by 2,
PRINT "FALSE."

""")
print(pseudo_code)

even_number = int(input("Enter the choosen number: "))

if(even_number % 2 == 0):
    print('TRUE', even_number, 'is an even number.')
    
else:
    print('FALSE', even_number, 'is not an even number.')
    
