import sys

def f_gold ( num ) :
    length = len ( num )
    if length == 1 and num [ 0 ] == '0' :
        return True
    if length % 3 == 1 :
        num += '00'
        length += 2
    elif length % 3 == 2 :
        num += '0'
        length += 1
    sum , p = 0 , 1
    for i in range ( length - 1 , - 1 , - 1 ) :
        group = 0
        group += num [ i ] - '0'
        group += ( num [ i ] - '0' ) * 10
        group += ( num [ i ] - '0' ) * 100
        sum = sum + group * p
        p *= ( - 1 )
    sum = abs ( sum )
    return ( sum % 13 == 0 )

if __name__ == '__main__':
    param = [
    ('vzTUaItpCpLnjY',),
    ('33855',),
    ('0011110101011',),
    ('MMQ',),
    ('439340517954',),
    ('000000000',),
    ('UugAuRRJbjEgl',),
    ('6406553695441',),
    ('011001',),
    ('yjFqEEvgiNjEX',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
