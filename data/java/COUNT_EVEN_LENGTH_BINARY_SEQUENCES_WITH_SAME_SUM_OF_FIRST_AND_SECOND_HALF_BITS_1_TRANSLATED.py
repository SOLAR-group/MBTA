import sys

def f_gold ( n ) :
    nCr , res = 1 , 1
    for r in range ( 1 , n + 1 ) :
        nCr = ( nCr * ( n + 1 - r ) ) / r
        res += nCr ** 2
    return res

if __name__ == '__main__':
    param = [
    (52,),
    (75,),
    (25,),
    (80,),
    (18,),
    (17,),
    (33,),
    (8,),
    (99,),
    (8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_EVEN_LENGTH_BINARY_SEQUENCES_WITH_SAME_SUM_OF_FIRST_AND_SECOND_HALF_BITS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
