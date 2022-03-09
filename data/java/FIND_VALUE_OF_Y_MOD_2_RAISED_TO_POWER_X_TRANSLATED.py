import sys

def f_gold ( y , x ) :
    if ( math.log ( y ) / math.log ( 2 ) ) < x :
        return y
    if x > 63 :
        return y
    return ( y % ( 1 << int ( x ) ) )

if __name__ == '__main__':
    param = [
    (57,76,),
    (80,46,),
    (84,96,),
    (35,16,),
    (3,84,),
    (42,79,),
    (7,2,),
    (99,83,),
    (13,61,),
    (44,8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_VALUE_OF_Y_MOD_2_RAISED_TO_POWER_X," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
