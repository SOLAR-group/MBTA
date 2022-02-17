====================
def f_gold ( str ) :
    """
 Check if the string is a gold string.
 """
    list = [ ]
    for c in str :
        if list.count ( c ) > 0 :
            list.remove ( ord ( c ) )
        else :
            list.append ( c )
    if len ( str ) % 2 == 0 and not list or ( len ( str ) % 2 == 1 and len ( list ) == 1 ) :
        return True
    else :
        return False

