import sys

def f_gold ( x ) :
    """
 Return the next higher number with the same bit set as x.
 """
    right_one , next_higher_one_bit , right_ones_pattern , next = x
    if next_higher_one_bit :
        right_one = x & - x
        next_higher_one_bit = x + right_one
        right_ones_pattern = x ^ next_higher_one_bit
        right_ones_pattern = ( right_ones_pattern ) // right_one
        right_ones_pattern >>= 2
        next = next_higher_one_bit | right_ones_pattern
    return next

if __name__ == '__main__':
    param = [
    (42,),
    (75,),
    (94,),
    (5,),
    (52,),
    (22,),
    (77,),
    (44,),
    (85,),
    (59,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_HIGHER_NUMBER_WITH_SAME_NUMBER_OF_SET_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
