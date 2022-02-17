====================
def find_equal_point_string_braces ( str ) :
    """
 Find the two strings that have the same number of brackets in the string.
 """
    len = len ( str )
    open = [ ]
    close = [ ]
    index = - 1
    open.append ( 0 )
    close.append ( 0 )
    if str [ 0 ] == '(' :
        open.append ( 1 )
    if str [ len ( str ) - 1 ] == ')' :
        close.append ( 1 )
    for i in range ( 1 , len ( str ) ) :
        if str [ i ] == '(' :
            open.append ( open [ i ] + 1 )
        else :
            open.append ( open [ i ] )
    for i in range ( len ( str ) - 2 , - 1 , - 1 ) :
        if str [ i ] == ')' :
            close.append ( close [ i + 1 ] + 1 )
        else :
            close.append ( close [ i + 1 ] )
    if open == 0 :
        return len ( str )
    if close == 0 :
        return 0
    for i in range ( 0 , len ( str ) ) :
        if open [ i ] == close [ i ] :
            index = i
    return index

