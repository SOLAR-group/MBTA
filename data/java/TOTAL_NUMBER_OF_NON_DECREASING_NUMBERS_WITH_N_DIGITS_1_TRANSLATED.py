import sys

def f_gold ( n ) :
    N = 10
    count = 1
    for i in range ( 1 , n + 1 ) :
        count *= ( N + i - 1 )
        count /= i
    return count

if __name__ == '__main__':
    param = [
    (40,),
    (11,),
    (94,),
    (73,),
    (6,),
    (73,),
    (58,),
    (40,),
    (64,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
