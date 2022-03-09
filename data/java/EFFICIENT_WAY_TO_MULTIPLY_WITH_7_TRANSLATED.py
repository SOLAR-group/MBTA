import sys

def f_gold ( n ) :
    return ( ( n << 3 ) - n )

if __name__ == '__main__':
    param = [
    (41,),
    (42,),
    (62,),
    (4,),
    (31,),
    (75,),
    (5,),
    (75,),
    (85,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EFFICIENT_WAY_TO_MULTIPLY_WITH_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
