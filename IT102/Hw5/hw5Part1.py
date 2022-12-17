Name = str(input("Hi What is your name? "))
Cost = float(input("Hi " + Name + ", I know you have 50000 for the down payment of your new house. Please enter the cost of the house you would like to purchase? "))
X = 50000*10.1
if Cost <= 10000.00:
    print ("Error! Please try again with a higher number! ")
elif Cost >= 1000000.00:
    print("Error! Please try again with a lower number! ")
elif 50000 >= (Cost*20)/100:
    print("You will not have to pay the mortgage insurance. ")
elif 50000 >= (Cost*10)/100: 
    print("You can still purchase the home but will have to pay the insurance. ")
else:
    print("Unfortunately you cannot be eligible to purchase the home. The maximum price you can afford is: ",X)