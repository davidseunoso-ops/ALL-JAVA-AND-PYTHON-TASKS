def prime_numbers(numbers_in_bag):
    numbers_bag = []
    for numbers in numbers_in_bag:
        if numbers < 2:
            continue
            
        is_prime = True
        for index in range(2, numbers):
            if numbers % index == 0:
                is_prime = False
                break
            
        if is_prime:
            numbers_bag.append(numbers)
        
    return numbers_bag
    
            
def replacing(the_numbers):
    numbers_bag = []
    for number in range(len(the_numbers)):
        #number.append(the_numbers[number])
        if the_numbers[number] < 0:
            the_numbers[number] = 0
            
        
    return the_numbers
    
    
def moving_zeros(numbers_in_list):
    number_bag = []
    number_bag_updated = []
    for index in range(len(numbers_in_list)):
        if numbers_in_list[index] == 0:
            number_bag_updated.append(0)
        else:
            number_bag.append(numbers_in_list[index])
            
    return number_bag + number_bag_updated
    

def duplicate_elements(number_list):
    the_elements = []
    for index in range(len(number_list)):
        for count in range(0, index):
            if number_list(index) == number_list(count):
                duplicate.append(number_list(count))
            return number_list[count]
    
        
    

        
    
    
result_one = prime_numbers([5,9,3,6,2])
result_two = replacing([5,-9,3,-6,2,-11])
result_three = moving_zeros([5,0,3,0,2,0])
result_four = duplicate_elements([45,60,3,0,67,2,45,3,22,0])

print(result_one)
print(result_two)
print(result_three)
print(result_four)
    
