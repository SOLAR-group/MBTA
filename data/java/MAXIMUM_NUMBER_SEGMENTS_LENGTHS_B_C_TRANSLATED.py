import sys

def f_gold ( n , a , b , c ) :
    dp = np.zeros ( ( n + 10 , ) )
    np.random.seed ( 0 )
    dp [ : , 0 ] = - 1
    dp [ : , 1 ] = 0
    for i in range ( n ) :
        if dp [ i ] != - 1 :
            if i + a <= n :
                dp [ i + a ] = max ( dp [ i ] + 1 , dp [ i + a ] )
            if i + b <= n :
                dp [ i + b ] = max ( dp [ i ] + 1 , dp [ i + b ] )
            if i + c <= n :
                dp [ i + c ] = max ( dp [ i ] + 1 , dp [ i + c ] )
    return dp

if __name__ == '__main__':
    param = [
    (23,16,23,18,),
    (62,76,81,97,),
    (32,46,1,78,),
    (82,48,72,58,),
    (94,99,62,38,),
    (44,21,46,60,),
    (4,57,2,77,),
    (53,23,80,5,),
    (9,55,26,85,),
    (23,15,73,42,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
