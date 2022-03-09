import sys

def f_gold ( n ) :
    if n == 2 or n == 3 :
        return ( n - 1 )
    res = 1
    while n > 4 :
        n -= 3
        res *= 3
    return ( n * res )

if __name__ == '__main__':
    param = [
        (62,),
        (53,),
        (8,),
        (6,),
        (35,),
        (35,),
        (46,),
        (74,),
        (69,),
        (3,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_36_CUT_A_ROPE_TO_MAXIMIZE_PRODUCT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
