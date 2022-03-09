import sys

def f_gold ( s ) :
    if len ( s ) == 0 :
        print ( 0 )
    ans = 0
    o , c = 0 , 0
    for c in s :
        if c == '(' :
            o += 1
        if c == ')' :
            c += 1
    if o != c :
        return - 1
    a = [ ]
    if s [ 0 ] == '(' :
        a.append ( 1 )
    else :
        a.append ( - 1 )
    if a [ 0 ] < 0 :
        ans += abs ( a [ 0 ] )
    for i in range ( 1 , len ( s ) ) :
        if s [ i ] == '(' :
            a.append ( a [ i - 1 ] + 1 )
        else :
            a.append ( a [ i - 1 ] - 1 )
        if a [ i ] < 0 :
            ans += abs ( a [ i ] )
    return ans

if __name__ == '__main__':
    param = [
    ('()',),
    ('))((',),
    ('())',),
    ('(()',),
    ('(()()())',),
    ('))())(()(())',),
    ('))(())((',),
    ('49',),
    ('00001111',),
    ('KDahByG ',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
