## - FUNCTIONS
def enterScore(assessment_name):
    #  pre: String value which is the name of the assessment to be scored
    # post: Returns a numeric value between 0 and 100 (percentage)
    # desc: Prompt (and reprompt) the user for the score of the defined assessment
    percentage = float(input("What is the percentage for " + assessment_name))
    #can also do as an if/else statement
    while percentage < 0 or percentage > 100:
        percentage = float(input("Invalid. What is the percentage for " + assessment_name))
    return percentage
def calcFinalGrade(homework, midterm, final):
    # pre: All three values are numeric between 0 and 100
    # post: Return a numeric value between 0 and 100 after applying each weight
    # desc: Homework (30%), Midterm (30%), Final (40%)
    final_grade = homework * .3 + midterm * .3 + final * .4
    return final_grade

def printGrade(name, grade, letter):
    # pre: String value for name and letter, numeric value 0-100 for grade
    # post: Print out a formatted message that includes all three parameters
    # desc:
    print("The letter grade for", name, "is", letter, ", they received a", grade, "%")

def lookupLetterGrade(score):
    #  pre: Numeric value 0-100
    # post: Return a letter {A, B, C, D, F} based on the value of the score
    # desc: 90-100 A, 80-90 B, 70-80 C, 60-70 D, < 60 F
    #pass
if percent >= 90:
        letter = 'A'
    elif percent >= 80:
        letter = 'B'
    elif percent >= 70:
        letter = 'C'
    elif percent >= 60:
        letter = 'D'
    else :
            letter = 'F'
            return letter

## - MAIN EXECUTION
student = input("Student name: ")

midterm_exam = enterScore("Midterm Exam")
final_exam = enterScore("Final Exam")

homework_total = 0
for i in range(1,13):
    homework_total += enterScore("Homework #"+str(i))

homework_average = homework_total / 12

grade = calcFinalGrade(homework_average, midterm_exam, final_exam)

printGrade(student, grade, lookupLetterGrade(grade))

