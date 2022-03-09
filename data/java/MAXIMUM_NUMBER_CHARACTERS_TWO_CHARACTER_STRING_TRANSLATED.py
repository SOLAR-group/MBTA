import sys

def f_gold ( str ) :
    n = len ( str )
    res = - 1
    for i in range ( n - 1 ) :
        for j in range ( i + 1 , n ) :
            if str [ i ] == str [ j ] :
                res = max ( res , abs ( j - i - 1 ) )
    return res

if __name__ == '__main__':
    param = [
    ('cI',),
    ('76478',),
    ('1',),
    ('tr',),
    ('10',),
    ('01',),
    ('Rmhzp',),
    ('5784080133917',),
    ('1100',),
    ('OK',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
