import sys

def f_gold ( str ) :
    N = len ( str )
    dp = [ 0 ] * N + [ 0 ] * N + [ 0 ] * N
    for i in range ( 0 , N + 1 ) :
        for j in range ( 0 , N + 1 ) :
            dp [ i ] [ j ] = 0
    for len in range ( 1 , N + 1 ) :
        for i , j in zip ( range ( 0 , N + 1 ) , range ( 0 , N + 1 ) ) :
            if len == 1 :
                dp [ i ] [ j ] = 1
            else :
                dp [ i ] [ j ] = 1 + dp [ i + 1 ] [ j ]
                if str [ i ] == str [ i + 1 ] :
                    dp [ i ] [ j ] = min ( 1 + dp [ i + 2 ] [ j ] , dp [ i ] [ j ] )
                for K in range ( i + 2 , j + 1 ) :
                    if str [ i ] == str [ K ] :
                        dp [ i ] [ j ] = min ( dp [ i + 1 ] [ K - 1 ] + dp [ K + 1 ] [ j ] , dp [ i ] [ j ] )
    return dp [ 0 ] [ N - 1 ]

if __name__ == '__main__':
    param = [
        ('YCtLQtHLwr',),
        ('47713514383248',),
        ('0100101001111',),
        ('XfdIYVn',),
        ('45499225407',),
        ('000100111001',),
        ('ZoUQhQwoap',),
        ('18579027952',),
        ('00000001111',),
        ('JD',)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
