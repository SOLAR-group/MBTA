import sys

def f_gold ( x , y , z ) :
    if ( y / x ) != 1 :
        return ( ( y / z ) != 1 )
    return ( ( x / z ) != 1 )

if __name__ == '__main__':
    param = [
    (48,63,56,),
    (11,55,84,),
    (50,89,96,),
    (21,71,74,),
    (94,39,42,),
    (22,44,86,),
    (3,41,68,),
    (67,62,94,),
    (59,2,83,),
    (50,11,1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SMALLEST_OF_THREE_INTEGERS_WITHOUT_COMPARISON_OPERATORS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
