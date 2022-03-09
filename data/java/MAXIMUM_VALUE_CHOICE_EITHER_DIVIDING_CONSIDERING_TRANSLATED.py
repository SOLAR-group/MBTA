import sys

def f_gold ( n ) :
    res = [ 0 ] * ( n + 1 )
    for i in range ( 2 , n + 1 ) :
        res [ i ] = max ( i , ( res [ i / 2 ] + res [ i / 3 ] + res [ i / 4 ] + res [ i / 5 ] ) )
    return res

if __name__ == '__main__':
    param = [
    (3,),
    (19,),
    (39,),
    (89,),
    (96,),
    (68,),
    (48,),
    (5,),
    (3,),
    (4,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
