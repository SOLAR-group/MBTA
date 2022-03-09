import sys

def f_gold ( low , high ) :
    """
 Return the number of gold numbers in a given range.

 Parameters
 -----
 low : int
 low of the range
 high : int
 high of the range

 Returns
 -----
 f_gold : int
 number of gold numbers in the range
 """
    fact , x = 1 , 1
    while fact < low :
        fact , x = fact * x , x + 1
    res = 0
    while fact <= high :
        res += 1
        fact , x = fact * x , x + 1
    return res

if __name__ == '__main__':
    param = [
    (57,79,),
    (57,21,),
    (31,37,),
    (62,87,),
    (49,98,),
    (82,76,),
    (31,45,),
    (5,52,),
    (76,43,),
    (55,6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
