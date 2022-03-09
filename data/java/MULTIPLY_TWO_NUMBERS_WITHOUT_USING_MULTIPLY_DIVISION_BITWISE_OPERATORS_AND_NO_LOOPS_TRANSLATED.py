import sys

def f_gold ( x , y ) :
    if y == 0 :
        return 0
    if y > 0 :
        return ( x + f_gold ( x , y - 1 ) )
    if y < 0 :
        return - f_gold ( x , - y )
    return - 1

if __name__ == '__main__':
    param = [
    (18,94,),
    (23,36,),
    (24,22,),
    (75,92,),
    (25,43,),
    (57,32,),
    (31,57,),
    (8,17,),
    (12,76,),
    (74,70,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MULTIPLY_TWO_NUMBERS_WITHOUT_USING_MULTIPLY_DIVISION_BITWISE_OPERATORS_AND_NO_LOOPS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MULTIPLY_TWO_NUMBERS_WITHOUT_USING_MULTIPLY_DIVISION_BITWISE_OPERATORS_AND_NO_LOOPS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
