def isApproved(salesPrice: float, creditScore: int):
    return ("The buyer is approved") if (salesPrice < 1000000) and (creditScore >= 600) else ("The buyer is not approved")
    
    
print(isApproved(900000, 720))
print(isApproved(1200000, 550))