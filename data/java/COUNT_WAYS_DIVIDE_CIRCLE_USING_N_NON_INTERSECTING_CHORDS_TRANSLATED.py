import sys

def f_gold ( A ) :
    n = 2 * A
    dpArray = np.zeros ( ( n + 1 , ) )
    dpArray [ 0 , 0 ] = 1
    dpArray [ 2 , 0 ] = 1
    for i in range ( 4 , n + 1 , 2 ) :
        for j in range ( 0 , i - 1 , 2 ) :
            dpArray [ i , j ] += ( dpArray [ j , i - 2 - j ] * dpArray [ i - 2 - j ] )
    return dpArray [ n ]

if __name__ == '__main__':
    param = [
    (32,),
    (52,),
    (52,),
    (32,),
    (73,),
    (31,),
    (29,),
    (75,),
    (39,),
    (49,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
