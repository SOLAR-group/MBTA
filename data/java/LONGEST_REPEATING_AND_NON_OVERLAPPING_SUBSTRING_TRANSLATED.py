import sys

def f_gold ( str ) :
    n = len ( str )
    LCSRe = [ 0 ] * n + [ 0 ] * n + [ 0 ] * n
    res = ""
    res_length = 0
    i , index = 0 , 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( i + 1 , n + 1 ) :
            if str [ i - 1 ] == str [ j - 1 ] and LCSRe [ i - 1 ] [ j - 1 ] < ( j - i ) :
                LCSRe [ i ] [ j ] = LCSRe [ i - 1 ] [ j - 1 ] + 1
                if LCSRe [ i ] [ j ] > res_length :
                    res_length = LCSRe [ i ] [ j ]
                    index = max ( i , index )
            else :
                LCSRe [ i ] [ j ] = 0
    if res_length > 0 :
        for i in range ( index - res_length + 1 , index + 1 ) :
            res += str [ i - 1 ]
    return res

if __name__ == '__main__':
    param = [
    ('fbfHTjE',),
    ('09285256323',),
    ('0011000101110',),
    ('ue JkVZTt',),
    ('48387612426300',),
    ('010',),
    ('ddRrUz',),
    ('1049162633793',),
    ('100011',),
    ('iJfadiVaQqv',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
