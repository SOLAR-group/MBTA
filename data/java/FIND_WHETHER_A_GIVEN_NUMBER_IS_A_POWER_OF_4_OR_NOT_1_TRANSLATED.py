import sys

def f_gold ( n ) :
    count = 0
    x = n & ( n - 1 )
    if n > 0 and x == 0 :
        while n > 1 :
            n >>= 1
            count += 1
        return ( count % 2 == 0 )
    return 0

if __name__ == '__main__':
    param = [
    (1,),
    (4,),
    (64,),
    (-64,),
    (128,),
    (1024,),
    (45,),
    (33,),
    (66,),
    (74,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
