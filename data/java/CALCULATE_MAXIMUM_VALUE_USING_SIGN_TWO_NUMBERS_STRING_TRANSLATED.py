import sys

def f_gold ( str ) :
    res = str [ 0 ] - '0'
    for i in range ( 1 , len ( str ) ) :
        if str [ i ] == '0' or str [ i ] == '1' or res < 2 :
            res += ( str [ i ] - '0' )
        else :
            res *= ( str [ i ] - '0' )
    return res

if __name__ == '__main__':
    param = [
    ('pR',),
    ('9518',),
    ('1',),
    ('nNMCIXUCpRMmvO',),
    ('3170487',),
    ('0100101010',),
    ('Z rONcUqWb',),
    ('00419297',),
    ('00',),
    ('r',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
