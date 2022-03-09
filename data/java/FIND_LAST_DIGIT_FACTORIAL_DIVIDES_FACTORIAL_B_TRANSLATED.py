import sys

def f_gold ( A , B ) :
    variable = 1
    if A == B :
        return 1
    elif ( B - A ) >= 5 :
        return 0
    else :
        for i in range ( A + 1 , B + 1 ) :
            variable = int ( variable * ( i % 10 ) ) % 10
        return variable % 10

if __name__ == '__main__':
    param = [
    (79,84,),
    (61,29,),
    (39,77,),
    (39,65,),
    (61,78,),
    (86,73,),
    (7,92,),
    (86,50,),
    (86,63,),
    (11,2,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
