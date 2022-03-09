import sys

def f_gold ( a , b , c ) :
    if a > b :
        if b > c :
            return b
        elif a > c :
            return c
        else :
            return a
    else :
        if a > c :
            return a
        elif b > c :
            return c
        else :
            return b

if __name__ == '__main__':
    param = [
    (43,24,7,),
    (76,54,66,),
    (57,5,40,),
    (10,13,4,),
    (59,47,56,),
    (92,14,50,),
    (49,62,65,),
    (16,95,12,),
    (33,41,90,),
    (66,63,46,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
