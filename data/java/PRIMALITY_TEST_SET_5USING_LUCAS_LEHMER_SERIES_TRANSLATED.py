import sys

def f_gold ( p ) :
    """
 Return True if the number of gold points is the same as the number of gold points.
 """
    check_number = pow ( 2 , p ) - 1
    nextval = 4 % check_number
    for i in range ( 1 , p - 1 ) :
        nextval = ( nextval * nextval - 2 ) % check_number
    return ( nextval == 0 )

if __name__ == '__main__':
    param = [
    (11,),
    (27,),
    (31,),
    (47,),
    (3,),
    (14,),
    (41,),
    (72,),
    (39,),
    (22,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
