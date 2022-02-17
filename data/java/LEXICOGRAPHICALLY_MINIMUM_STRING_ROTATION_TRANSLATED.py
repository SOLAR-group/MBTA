====================
def f_gold ( str ) :
    n = len ( str )
    arr = [ ]
    concat = str + str
    for i in range ( n ) :
        arr.append ( concat [ i : i + n ] )
    arr.sort ( )
    return arr

