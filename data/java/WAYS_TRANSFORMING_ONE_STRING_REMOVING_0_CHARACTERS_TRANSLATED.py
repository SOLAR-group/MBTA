import sys

def f_gold ( a , b ) :
    n , m = len ( a ) , len ( b )
    if m == 0 :
        return 1
    dp = [ 0 ] * ( m + 1 ) * n + 1
    for i in range ( m ) :
        for j in range ( i , n ) :
            if i == 0 :
                if j == 0 :
                    dp [ i ] [ j ] = ( a [ j ] == b [ i ] )
                elif a [ j ] == b [ i ] :
                    dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + 1
                else :
                    dp [ i ] [ j ] = dp [ i ] [ j - 1 ]
            elif a [ j ] == b [ i ] :
                dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i - 1 ] [ j - 1 ]
            else :
                dp [ i ] [ j ] = dp [ i ] [ j - 1 ]
    return dp [ m - 1 ] [ n - 1 ]

if __name__ == '__main__':
    param = [
    ('abcccdf','abccdf',),
    ('aabba','ab',),
    ('aabsdfljk','aa',),
    ('IONiqV','XKbBiGZ',),
    ('9667771256770','50915176',),
    ('10001011','01',),
    ('fczbDtMDT','FbX',),
    ('298746088','29888',),
    ('01100011000','0',),
    ('Qk','',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
