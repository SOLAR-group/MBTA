import sys

def f_gold ( n ) :
    import sys
    if n > 0 and ( n & ( n - 1 ) ) == 0 :
        return n
    while p < n :
        p <<= 1
    return p

if __name__ == '__main__':
    param = [
    (31,),
    (89,),
    (92,),
    (66,),
    (38,),
    (34,),
    (17,),
    (24,),
    (54,),
    (20,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SMALLEST_POWER_OF_2_GREATER_THAN_OR_EQUAL_TO_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
