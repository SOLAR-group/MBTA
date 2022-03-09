import sys

def f_gold ( n , k , x ) :
    dp = np.zeros ( ( 109 , n ) )
    dp [ 0 , 0 ] = 0
    dp [ 1 , 1 ] = 1
    for i in range ( 2 , n ) :
        dp [ i , 1 ] = ( k - 2 ) * dp [ i - 1 , 1 ] + ( k - 1 ) * dp [ i - 2 , 1 ]
    return ( x == 1 if ( k - 1 ) * dp [ n - 2 ] else dp [ n - 1 ] )

if __name__ == '__main__':
    param = [
    (9,40,38,),
    (97,47,30,),
    (16,28,13,),
    (16,82,70,),
    (6,81,29,),
    (58,10,55,),
    (6,47,20,),
    (22,4,64,),
    (51,46,66,),
    (58,25,53,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
