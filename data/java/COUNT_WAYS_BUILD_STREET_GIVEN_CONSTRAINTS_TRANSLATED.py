import sys

def f_gold ( n ) :
    dp = np.zeros ( ( 2 , n + 1 ) )
    dp [ 0 , 1 ] = 1
    dp [ 1 , 1 ] = 2
    for i in range ( 2 , n + 1 ) :
        dp [ 0 , i ] = dp [ 0 , i - 1 ] + dp [ 1 , i - 1 ]
        dp [ 1 , i ] = dp [ 0 , i - 1 ] * 2 + dp [ 1 , i - 1 ]
    return dp [ 0 , n ] + dp [ 1 , n ]

if __name__ == '__main__':
    param = [
    (68,),
    (91,),
    (99,),
    (79,),
    (61,),
    (48,),
    (89,),
    (20,),
    (83,),
    (1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_WAYS_BUILD_STREET_GIVEN_CONSTRAINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
