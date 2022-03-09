import sys

def f_gold ( n ) :
    if n == 0 :
        return 0
    else :
        return ( n & 1 ) + get_count_set_bits_in_an_integer_1 ( n >> 1 )

if __name__ == '__main__':
    param = [
    (43,),
    (94,),
    (72,),
    (86,),
    (42,),
    (33,),
    (8,),
    (74,),
    (29,),
    (34,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
