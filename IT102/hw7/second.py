even_count = 0
for indx in range(4):
    num = int(input('Enter an integer : '))
    if num%2 == 0:
        print('{} is even'.format(num))
        even_count = even_count + 1
    else:
        print('{} is odd'.format(num))
print('\n{} out of 4 integers are even'.format(even_count))