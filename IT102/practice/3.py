sum = 0
num = int(input("Enter number of dogs at office"))
while num<0 or num>25:
    num=int(input("Error. Enter: "))
for i in range (1, num+1):
    weight = float(input("Enter weight of dog#:"))
    sum += weight
average = sum/num
print ("the Average wieght of the", num , "dogs is", average)