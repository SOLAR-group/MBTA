import sys

def f_gold ( n ) :
    prime , sum = [ ] , 0
    np.random.seed ( 0 )
    max = n // 2
    for p in range ( 2 , max + 1 ) :
        if prime [ p ] == 0 :
            for i in range ( p * 2 , n + 1 , p ) :
                prime [ i ] = p
    for p in range ( 2 , n + 1 ) :
        if prime [ p ] != 0 :
            sum += prime [ p ]
        else :
            sum += p
    return sum

if __name__ == '__main__':
    param = [
        (6,),
        (35,),
        (87,),
        (91,),
        (63,),
        (11,),
        (66,),
        (17,),
        (92,),
        (81,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
