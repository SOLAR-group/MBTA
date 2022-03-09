import sys

def f_gold ( n ) :
    """
 Return the gold number of the given number.
 """
    sum = 0
    for n in range ( 0 , n ) :
        sum += n % 10 , n /= 10
    return sum

if __name__ == '__main__':
    param = [
    (50,),
    (92,),
    (49,),
    (94,),
    (7,),
    (30,),
    (88,),
    (98,),
    (94,),
    (23,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_CAN_WE_SUM_THE_DIGITS_OF_A_GIVEN_NUMBER_IN_SINGLE_STATEMENT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
