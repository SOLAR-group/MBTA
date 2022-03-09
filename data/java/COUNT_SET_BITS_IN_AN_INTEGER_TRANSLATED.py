import sys

def f_gold ( n ) :
    count = 0
    while n :
        count += n & 1
        n >>= 1
    return count

if __name__ == '__main__':
    param = [
    (58,),
    (92,),
    (73,),
    (52,),
    (24,),
    (14,),
    (58,),
    (11,),
    (8,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
