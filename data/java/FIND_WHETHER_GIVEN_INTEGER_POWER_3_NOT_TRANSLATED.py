import sys

def f_gold ( n ) :
    return [ 1162261467 % n for n in range ( 1 , n + 1 ) ]

if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (27,),
    (9,),
    (-9,),
    (11,),
    (57,),
    (21,),
    (60,),
    (44,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
