import sys

def f_gold ( n ) :
    C = np.zeros ( ( n + 1 , n + 1 ) )
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , min ( i , n ) ) :
            if j == 0 or j == i :
                C [ i , j ] = 1
            else :
                C [ i , j ] = C [ i - 1 , j - 1 ] + C [ i - 1 , j ]
    sum = 0
    for i in range ( 0 , n + 1 ) :
        sum += C [ n , i ]
    return sum

if __name__ == '__main__':
    param = [
    (8,),
    (39,),
    (25,),
    (44,),
    (72,),
    (6,),
    (72,),
    (62,),
    (48,),
    (39,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_BINOMIAL_COEFFICIENTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
