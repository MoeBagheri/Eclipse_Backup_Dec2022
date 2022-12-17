def exam1(name, n):
    if n < 6 :
        print (name, ' is not old enough' )
        return -1
    else :
        print(name, ' will be in school soon' )
        return n + 1
    
if exam1("Billy", 8) != -1 :
    print ('School starts!')