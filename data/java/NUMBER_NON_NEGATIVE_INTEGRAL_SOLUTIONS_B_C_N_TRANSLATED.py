import sys

def f_gold ( n ) :
    result = 0
    for i in range ( 0 , n ) :
        for j in range ( 0 , n - i ) :
            for k in range ( 0 , ( n - i - j ) ) :
                if i + j + k == n :
                    result += 1
    return result

if __name__ == '__main__':
    param = [
    (62,),
    (44,),
    (37,),
    (81,),
    (14,),
    (20,),
    (76,),
    (72,),
    (96,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
