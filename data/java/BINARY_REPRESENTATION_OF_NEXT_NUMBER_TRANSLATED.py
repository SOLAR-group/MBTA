import sys

def f_gold ( num ) :
    l = len ( num )
    i = 0
    for i in range ( l - 1 , - 1 , - 1 ) :
        if num [ i ] == '0' :
            num = num [ : i ] + '1' + num [ i + 1 : ]
            break
        else :
            num = num [ : i ] + '0' + num [ i + 1 : ]
    if i < 0 :
        num = '1' + num
    return num

if __name__ == '__main__':
    param = [
    ('DXh',),
    ('48703586411816',),
    ('0001',),
    ('yWg WvjNKS',),
    ('8408568459',),
    ('01',),
    ('DFECZ CWtN',),
    ('37742236',),
    ('001101',),
    ('LDxERLmYn',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("BINARY_REPRESENTATION_OF_NEXT_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BINARY_REPRESENTATION_OF_NEXT_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
