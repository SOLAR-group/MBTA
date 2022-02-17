====================
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

