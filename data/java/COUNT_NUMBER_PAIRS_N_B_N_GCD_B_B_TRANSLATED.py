import sys

def f_gold ( n ) :
    k = n
    imin = 1
    ans = 0
    while imin <= n :
        imax = n // k
        ans += k * ( imax - imin + 1 )
        imin = imax + 1
        k = n // imin
    return ans

if __name__ == '__main__':
    param = [
        (17,),
        (72,),
        (43,),
        (55,),
        (62,),
        (22,),
        (17,),
        (68,),
        (20,),
        (29,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_PAIRS_N_B_N_GCD_B_B," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
