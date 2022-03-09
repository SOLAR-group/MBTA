import sys

def f_gold ( n ) :
    """
 Return the number of steps in the optimal solution to the given number of steps.
 """
    table = [ n + 1 ] * ( n + 1 )
    for i in range ( 0 , n + 1 ) :
        table [ i ] = n - i
    for i in range ( n , - 1 , - 1 ) :
        if not ( i % 2 > 0 ) :
            table [ i / 2 ] = min ( table [ i ] + 1 , table [ i / 2 ] )
        if not ( i % 3 > 0 ) :
            table [ i / 3 ] = min ( table [ i ] + 1 , table [ i / 3 ] )
    return table [ 1 ]

if __name__ == '__main__':
    param = [
    (59,),
    (7,),
    (90,),
    (78,),
    (49,),
    (15,),
    (45,),
    (56,),
    (7,),
    (70,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
