import sys

def f_gold ( s ) :
    n = len ( s )
    count = 0
    for i in range ( n ) :
        if s [ i ] in [ '4' , '8' , '0' ] :
            count += 1
    for i in range ( n - 1 ) :
        h = ( s [ i ] - '0' ) * 10 + ( s [ i + 1 ] - '0' )
        if h % 4 == 0 :
            count = count + i + 1
    return count

if __name__ == '__main__':
    param = [
    ('Qaq',),
    ('9400761825850',),
    ('0011001111',),
    ('lasWqrLRq',),
    ('5662',),
    ('110',),
    (' tOYKf',),
    ('6536991235305',),
    ('11111',),
    ('uZftT iDHcYiCt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
