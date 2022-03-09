import sys

def f_gold ( n ) :
    DP = np.zeros ( ( n + 1 , n + 1 ) )
    DP [ 0 , 0 ] = DP [ 1 , 1 ] = DP [ 2 , 2 ] = 1
    DP [ 3 , 3 ] = 2
    for i in range ( 4 , n + 1 ) :
        DP [ i , i ] = DP [ i - 1 , i - 3 ] + DP [ i - 4 , i - 2 ]
    return DP

if __name__ == '__main__':
    param = [
    (44,),
    (9,),
    (19,),
    (10,),
    (78,),
    (94,),
    (70,),
    (81,),
    (81,),
    (49,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OFDIFFERENT_WAYS_EXPRESS_N_SUM_1_3_4," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
