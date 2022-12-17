def isApproved(salesPrice: float, creditScore: int):
    return ("The buyer is approved") if (salesPrice < 1000000) and (creditScore >= 600) else ("The buyer is not approved")
    
    
salesPrice = float(input('Enter the sales price:   '))
creditScore = int(input('Enter the credit score:   '))
print(isApproved(salesPrice, creditScore))