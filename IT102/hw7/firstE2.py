gpa_list = []
while len(gpa_list)!=25:
    gpa = float(input('Enter GPA : '))
    if(gpa>=0 and gpa<=4):
        gpa_list.append(gpa)
        print('Entered {} GPAs so far out of 25'.format(len(gpa_list)))
    else:
        print('GPA should be between 0 and 4, please try again')
#gpa_list.append(gpa)
print ("Here is all GPAs entered: ")
print (gpa_list)
total_gpa = 0
for gpa in gpa_list:
    total_gpa = total_gpa + gpa
average_gpa = total_gpa/len(gpa_list)
print('Average GPA = {}'.format(average_gpa))