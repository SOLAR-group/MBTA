import sys

def f_gold ( a , b ) :
    s = str ( b )
    i = 0
    for c in s :
        if c != '9' :
            break
    result = 0
    if i == len ( s ) :
        result = a * len ( s )
    else :
        result = a * ( len ( s ) - 1 )
    return result

if __name__ == '__main__':
    param = [
    (31,91,),
    (72,85,),
    (23,49,),
    (42,32,),
    (13,7,),
    (93,5,),
    (33,32,),
    (94,76,),
    (60,60,),
    (11,26,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
