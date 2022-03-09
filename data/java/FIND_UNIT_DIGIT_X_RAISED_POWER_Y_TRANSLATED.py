import sys

def f_gold ( x , y ) :
    res = 1
    for i in range ( y ) :
        res = ( res * x ) % 10
    return res

if __name__ == '__main__':
    param = [
    (33,55,),
    (95,7,),
    (21,63,),
    (3,62,),
    (40,53,),
    (64,24,),
    (17,23,),
    (58,74,),
    (44,13,),
    (27,54,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
