import sys

def f_gold ( n , k ) :
    dp = np.zeros ( ( n + 1 , k + 1 ) )
    dp [ 1 ] [ 0 ] = 1
    dp [ 1 ] [ 0 ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( i , k + 1 ) :
            dp [ i ] [ j ] [ 0 ] = dp [ i - 1 ] [ j ] [ 0 ] + dp [ i - 1 ] [ j ] [ 1 ]
            dp [ i ] [ j ] [ 1 ] = dp [ i - 1 ] [ j ] [ 0 ]
            if j - 1 >= 0 :
                dp [ i ] [ j ] [ 1 ] += dp [ i - 1 ] [ j - 1 ] [ 1 ]
    return dp [ n ] [ k ] [ 0 ] + dp [ n ] [ k ] [ 1 ]

if __name__ == '__main__':
    param = [
    (29,85,),
    (47,29,),
    (77,96,),
    (9,91,),
    (29,80,),
    (94,85,),
    (51,87,),
    (46,62,),
    (18,96,),
    (86,86,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_BINARY_STRINGS_K_TIMES_APPEARING_ADJACENT_TWO_SET_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
