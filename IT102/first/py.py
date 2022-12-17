'''
Created on Nov 4, 2020

@author: moebagheri
'''
gpa_list = []

while len(gpa_list)!=25:
    gpa = float(input('Enter gpa : '))
    if(gpa>=0 and gpa<=4):
        gpa_list.append(gpa)
        print('Entered {} gpa(s) so far'.format(len(gpa_list)))
    else:
        print('Gpa should be between 0 and 4, please try again')

total_gpa = 0
for gpa in gpa_list:
    total_gpa = total_gpa + gpa
average_gpa = total_gpa/len(gpa_list)
print('Average GPA = {}'.format(average_gpa))