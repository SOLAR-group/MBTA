import sys

def f_gold ( bin ) :
    n = len ( bin )
    if bin [ n - 1 ] == '1' :
        return False
    sum = 0
    for i in range ( n - 2 , - 1 , - 1 ) :
        if bin [ i ] == '1' :
            pos_from_right = n - i - 1
            if pos_from_right % 4 == 1 :
                sum = sum + 2
            elif pos_from_right % 4 == 2 :
                sum = sum + 4
            elif pos_from_right % 4 == 3 :
                sum = sum + 8
            elif pos_from_right % 4 == 0 :
                sum = sum + 6
    if sum % 10 == 0 :
        return True
    return False

if __name__ == '__main__':
    param = [
    ('101000',),
    ('39613456759141',),
    ('11',),
    ('PoiHjo',),
    ('2',),
    ('0000101',),
    ('T  s dZKeDX gK',),
    ('3944713969',),
    ('1000',),
    ('ifYUgdpmt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
