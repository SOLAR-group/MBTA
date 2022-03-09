import sys

def f_gold ( n ) :
    num = n
    dec_value = 0
    base = 1
    len ( num )
    for i in range ( len ( num ) - 1 , - 1 , - 1 ) :
        if num [ i ] == '1' :
            dec_value += base
        base = base * 2
    return dec_value

if __name__ == '__main__':
    param = [
    ('uEmIAgF',),
    ('753310137',),
    ('010011010',),
    ('kNi',),
    ('04562016903312',),
    ('000111101',),
    ('bk',),
    ('9',),
    ('1',),
    ('XxT nXLlk',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
