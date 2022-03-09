import sys

def f_gold ( N ) :
    dp = np.zeros ( N )
    dp [ 0 ] = 1
    dp [ 1 ] = 2
    i = 2
    do :
        dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ]
    while dp [ i ] <= N :
        return ( i - 2 )

if __name__ == '__main__':
    param = [
    (73,),
    (28,),
    (33,),
    (23,),
    (84,),
    (31,),
    (48,),
    (46,),
    (45,),
    (90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_GAMES_PLAYED_WINNER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
