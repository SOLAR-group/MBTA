import sys

def f_gold ( n ) :
    DP = np.zeros ( ( n + 1 , n + 1 ) )
    DP [ 0 , 0 ] = 0
    DP [ 1 , 0 ] = 1
    for i in range ( 2 , n + 1 ) :
        if i % 2 == 0 :
            DP [ i , i ] = DP [ i / 2 , i ]
        else :
            DP [ i , ( i - 1 ) / 2 ] = DP [ ( i + 1 ) / 2 , ( i + 1 ) / 2 ]
    return DP [ n ]

if __name__ == '__main__':
    param = [
    (37,),
    (24,),
    (13,),
    (56,),
    (26,),
    (67,),
    (82,),
    (60,),
    (64,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
