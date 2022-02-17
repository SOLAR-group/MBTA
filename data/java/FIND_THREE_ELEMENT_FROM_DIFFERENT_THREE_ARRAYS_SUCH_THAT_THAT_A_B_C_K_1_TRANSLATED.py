====================
def f_gold ( a1 , a2 , a3 , n1 , n2 , n3 , sum ) :
    s = set ( a1 )
    al = [ ]
    for i in range ( n1 ) :
        al.append ( sum - a2 [ i ] - a3 [ i ] )
    al.sort ( )
    for i in range ( n2 ) :
        for j in range ( n3 ) :
            if al.count ( sum - a2 [ i ] - a3 [ j ] ) & al.count ( sum - a2 [ i ] - a3 [ j ] ) != al [ - 1 ] :
                return True
    return False

