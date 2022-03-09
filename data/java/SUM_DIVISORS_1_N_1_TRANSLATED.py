import sys

def f_gold ( n ) :
    sum = 0
    for i in range ( 1 , n + 1 ) :
        sum += ( n / i ) ** i
    return sum

if __name__ == '__main__':
    param = [
    (73,),
    (41,),
    (36,),
    (28,),
    (49,),
    (24,),
    (85,),
    (59,),
    (82,),
    (40,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_DIVISORS_1_N_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_DIVISORS_1_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
