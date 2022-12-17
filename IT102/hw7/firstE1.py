gpa_list = [3.5,3.4,3.3,4,3.9,2.8,2.7,2,1.87,
            2.9,3.9,1.7,0.9,1.8,3,2.5,2,2.32,
            1.95,2.34,3.88,3.46,3.11,1.2,2.3]
total_gpa = 0
for gpa in gpa_list:
    total_gpa = total_gpa + gpa
average_gpa = total_gpa/len(gpa_list)
print (gpa_list)
print('Average GPA = {}'.format(average_gpa))