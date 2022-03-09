import sys

def f_gold ( n ) :
    if n == 0 :
        return False
    while n != 1 :
        if n % 2 != 0 :
            return False
        n = n / 2
    return True

if __name__ == '__main__':
    param = [
        (1,),
        (2,),
        (8,),
        (1024,),
        (24,),
        (7,),
        (46,),
        (61,),
        (73,),
        (66,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WRITE_ONE_LINE_C_FUNCTION_TO_FIND_WHETHER_A_NO_IS_POWER_OF_TWO," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
