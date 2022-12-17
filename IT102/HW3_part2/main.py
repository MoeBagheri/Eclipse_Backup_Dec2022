'''
Created on Sep 20, 2020

@author: moebagheri
'''
aSalary = int(input("Please input your annual salary? (Ex:30000) "))
yEmployed = int(input("Please input number of years employed? (Ex:3) "))
if aSalary <= 40000 :
    print("You Need a Job!")
if aSalary >= 60000 :
    print("You Make Equal or More Than $60K per Year!")
if aSalary <= 59999 :
    if yEmployed >=5 :
        print("Request 3% Increase")
    if yEmployed <=4:
        print("Request 5% Increase")
   