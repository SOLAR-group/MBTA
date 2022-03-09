import sys

def f_gold ( num ) :
    num = num.split ( '.' )
    count_zero = 0
    ch = None
    for i in range ( 1 , len ( num ) ) :
        ch = num [ i ]
        if ch == '0' :
            count_zero += 1
    return count_zero

if __name__ == '__main__':
    param = [
    ('HLlQWSphZcIC',),
    ('080287724',),
    ('0000100000',),
    (' Q',),
    ('4247040983',),
    ('00001011101',),
    ('LbNsnYTHmLbCf',),
    ('24',),
    ('110',),
    ('ie',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
