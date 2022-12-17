'''
Created on Sep 20, 2020

@author: moebagheri
'''
ChNumber = int(input("How many children? "))
if ChNumber == 1:
    print("your total due is $ 65")
else: 
    total = (ChNumber*50)+15
    print("$",total)
    
