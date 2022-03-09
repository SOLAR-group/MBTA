import sys

def f_gold ( s ) :
    n = len ( s )
    lps = [ 0 ] * n
    len = 0
    i = 1
    while i < n :
        if s [ i ] == s [ len ( s ) ] :
            len += 1
            lps [ i ] = len
            i += 1
        else :
            if len != 0 :
                len = lps [ len - 1 ]
            else :
                lps [ i ] = 0
                i += 1
    res = lps [ - 1 ]
    return ( res > n / 2 )

if __name__ == '__main__':
    param = [
    ('aabcdaabc',),
    ('1372494598',),
    ('110000100001',),
    ('abcab',),
    ('488938',),
    ('011010101011',),
    ('aaaa',),
    ('3356203205',),
    ('1010',),
    ('kkXiiTZkGeh',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
