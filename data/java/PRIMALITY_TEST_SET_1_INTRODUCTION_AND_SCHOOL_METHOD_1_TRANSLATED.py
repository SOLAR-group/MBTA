import sys

def f_gold ( n ) :
    if n <= 1 :
        return False
    if n <= 3 :
        return True
    if n % 2 == 0 or n % 3 == 0 :
        return False
    for i in range ( 5 , n * i <= n , 6 ) :
        if n % i == 0 or n % ( i + 2 ) == 0 :
            return False
    return True

if __name__ == '__main__':
    param = [
        (15,),
        (90,),
        (38,),
        (65,),
        (91,),
        (16,),
        (48,),
        (74,),
        (14,),
        (47,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRIMALITY_TEST_SET_1_INTRODUCTION_AND_SCHOOL_METHOD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
