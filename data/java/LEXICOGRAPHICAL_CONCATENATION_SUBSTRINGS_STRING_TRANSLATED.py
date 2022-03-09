import sys

def f_gold ( s ) :
    n = len ( s )
    sub_count = n * ( n + 1 ) // 2
    arr = [ ]
    index = 0
    for i in range ( n ) :
        for len in range ( 1 , n - i + 1 ) :
            arr.append ( s [ i : i + len ] )
    arr.sort ( )
    res = ""
    for i in range ( sub_count ) :
        res += arr [ i ]
    return res

if __name__ == '__main__':
    param = [
    ('sqGOi',),
    ('848580',),
    ('01001110011001',),
    ('ZhWXUKmeiI',),
    ('0917296541285',),
    ('01101001111100',),
    ('tjP kR',),
    ('999907',),
    ('011100',),
    ('qJPHNSJOUj',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
