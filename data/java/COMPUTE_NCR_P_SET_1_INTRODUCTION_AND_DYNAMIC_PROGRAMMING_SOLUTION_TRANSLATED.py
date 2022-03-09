import sys

def f_gold ( n , r , p ) :
    C = np.zeros ( ( r + 1 , ) )
    C [ 0 , 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( min ( i , r ) , r ) :
            C [ j , j ] = ( C [ j , j - 1 ] + C [ j - 1 , j ] ) % p
    return C

if __name__ == '__main__':
    param = [
    (82,5,94,),
    (45,24,95,),
    (44,68,61,),
    (88,24,43,),
    (90,75,57,),
    (98,55,43,),
    (80,54,88,),
    (60,75,65,),
    (52,73,86,),
    (71,26,45,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
