import sys

def f_gold ( n ) :
    A = np.zeros ( ( n + 1 , n + 1 ) )
    B = np.zeros ( ( n + 1 , n + 1 ) )
    A [ 0 , 0 ] = 1
    A [ 1 , 0 ] = 0
    B [ 0 , 0 ] = 0
    B [ 1 , 0 ] = 1
    for i in range ( 2 , n + 1 ) :
        A [ i , i - 2 ] = A [ i - 2 , i ] + 2 * B [ i - 1 , i ]
        B [ i , i ] = A [ i - 1 , i ] + B [ i - 2 , i ]
    return A , B

if __name__ == '__main__':
    param = [
    (29,),
    (13,),
    (25,),
    (65,),
    (27,),
    (42,),
    (19,),
    (50,),
    (59,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
