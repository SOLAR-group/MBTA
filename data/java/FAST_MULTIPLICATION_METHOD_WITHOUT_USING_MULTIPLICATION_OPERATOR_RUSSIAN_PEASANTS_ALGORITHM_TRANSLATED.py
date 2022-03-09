import sys

def f_gold ( a , b ) :
    res = 0
    while b :
        if ( b & 1 ) :
            res = res + a
        a = a << 1
        b = b >> 1
    return res

if __name__ == '__main__':
    param = [
    (4,33,),
    (36,67,),
    (65,52,),
    (55,37,),
    (35,76,),
    (69,98,),
    (84,62,),
    (5,80,),
    (15,36,),
    (67,84,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
