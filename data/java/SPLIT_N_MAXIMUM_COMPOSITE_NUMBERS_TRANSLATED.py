import sys

def f_gold ( n ) :
    if n < 4 :
        return - 1
    rem = n % 4
    if rem == 0 :
        return n // 4
    if rem == 1 :
        if n < 9 :
            return - 1
        return ( n - 9 ) // 4 + 1
    if rem == 2 :
        return ( n - 6 ) // 4 + 1
    if rem == 3 :
        if n < 15 :
            return - 1
        return ( n - 15 ) // 4 + 2
    return 0

if __name__ == '__main__':
    param = [
        (55,),
        (35,),
        (24,),
        (75,),
        (5,),
        (7,),
        (50,),
        (28,),
        (67,),
        (59,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
