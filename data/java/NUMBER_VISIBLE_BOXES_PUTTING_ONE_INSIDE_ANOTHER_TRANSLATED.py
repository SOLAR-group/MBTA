====================
def f_gold ( arr , n ) :
    q = Queue ( )
    arr.sort ( )
    q.put ( arr [ 0 ] )
    for i in range ( 1 , n ) :
        now = q.get ( )
        if arr [ i ] >= 2 * now :
            q.put ( )
        q.put ( arr [ i ] )
    return q.get ( )

