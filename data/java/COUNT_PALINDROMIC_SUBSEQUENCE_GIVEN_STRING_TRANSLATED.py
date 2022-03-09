import sys

def f_gold ( str ) :
    N = len ( str )
    cps = [ 1 for i in range ( N + 1 ) ]
    for i in range ( N + 1 ) :
        cps [ i ] [ i ] = 1
    for L in range ( 2 , N + 1 ) :
        for i in range ( N ) :
            k = L + i - 1
            if k < N :
                if str [ i ] == str [ k ] :
                    cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1
                else :
                    cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ]
    return cps [ 0 ] [ N - 1 ]

if __name__ == '__main__':
    param = [
    ('R',),
    ('2956350',),
    ('11100111110101',),
    ('TZTDLIIfAD',),
    ('98',),
    ('1100100001',),
    ('oKwGeatf',),
    ('19',),
    ('00010110100',),
    ('Cyq',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
