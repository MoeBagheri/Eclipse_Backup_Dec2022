donor_money_list = [100,200,150,-240,400,-518,220,660,118,80]

invalid_donation = 0
total_donation = 0
for donor_money in donor_money_list:
    if donor_money<0:
        invalid_donation = invalid_donation + 1
    else:
        total_donation = total_donation + donor_money
        
valid_donations = len(donor_money_list)-invalid_donation 
print('{} donations failed...'.format(invalid_donation))
print('{} of {} valid donations made ${}'.format(valid_donations,len(donor_money_list),total_donation))