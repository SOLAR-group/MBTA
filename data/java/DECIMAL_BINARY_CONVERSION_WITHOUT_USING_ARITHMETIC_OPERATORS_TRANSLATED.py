import sys

def f_gold ( n ) :
    if n == 0 :
        return '0'
    bin = ''
    while n :
        bin = ( ( n & 1 ) if n > 0 else '0' ) + bin
        n >>= 1
    return bin

if __name__ == '__main__':
    param = [
    (35,),
    (17,),
    (8,),
    (99,),
    (57,),
    (39,),
    (99,),
    (14,),
    (22,),
    (7,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECIMAL_BINARY_CONVERSION_WITHOUT_USING_ARITHMETIC_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
