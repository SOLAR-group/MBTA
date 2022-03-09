import sys

def f_gold ( n ) :
    x , y_count , res = 0 , 0 , 0
    for y_count in range ( 0 , n * y_count ) :
        res += y_count
        x += 1
        while y_count != 0 :
            res += y_count
            x += 1
            while y_count != 0 and ( x * x + ( y_count - 1 ) * ( y_count - 1 ) >= n ) :
                y_count -= 1
    return res

if __name__ == '__main__':
    param = [
    (72,),
    (75,),
    (92,),
    (30,),
    (45,),
    (40,),
    (81,),
    (17,),
    (81,),
    (99,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DISTINCT_NON_NEGATIVE_PAIRS_X_Y_SATISFY_INEQUALITY_XX_YY_N_2_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
