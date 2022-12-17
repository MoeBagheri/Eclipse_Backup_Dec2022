'''
Created on Sep 20, 2020

@author: moebagheri
'''
currentYear = 2020
name = str(input("What is your name? "))
age = int(input("How old are you? "))
major = str(input("What is your studying major? "))
gDate = int(input("What is your itended graduation date? (please input yyyy) "))
if gDate - currentYear >= 6:
    print("You will graduate too late!")
else:
    print("Have a good day!")
