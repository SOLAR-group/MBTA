import sys

def f_gold ( str ) :
    """
 Return a string with all occurrences of the given string and return
 the result.
 """
    len ( str )
    res = [ ]
    index , i = 0 , 0
    s = Stack ( )
    s.push ( 0 )
    while i < len ( str ) :
        if str [ i ] == '+' :
            if s.pop ( ) == 1 :
                res.append ( '-' )
            if s.pop ( ) == 0 :
                res.append ( '+' )
        elif str [ i ] == '-' :
            if s.pop ( ) == 1 :
                res.append ( '+' )
            elif s.pop ( ) == 0 :
                res.append ( '-' )
        elif str [ i ] == '(' and i > 0 :
            if str [ i - 1 ] == '-' :
                x = ( s.pop ( ) == 1 )
                s.push ( x )
            elif str [ i - 1 ] == '+' :
                s.push ( s.pop ( ) )
        elif str [ i ] == ')' :
            s.pop ( )
        else :
            res.append ( str [ i ] )
        i += 1
    return ''.join ( res )

if __name__ == '__main__':
    param = [
    ('ggbsMvMZcMOVd',),
    ('384292670',),
    ('10000100',),
    ('fdHME',),
    ('09198832',),
    ('0011111011',),
    ('SnXwRS',),
    ('071',),
    ('01101',),
    ('xwmqxgBa',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
