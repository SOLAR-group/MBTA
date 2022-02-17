====================
def f_gold ( str , len ) :
    i , j = 0 , len - 1
    for i , j in enumerate ( str ) :
        if i == j and str [ i ] != '*' :
            continue
        elif i == j and str [ i ] == '*' :
            str [ i ] = 'a'
            str [ j ] = 'a'
            continue
        elif i == j :
            str [ i ] = str [ j ]
            continue
        elif i == j :
            str [ j ] = str [ i ]
            continue
        print ( 'Not Possible' )
        return ''
    return str

