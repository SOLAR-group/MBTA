====================
def count_subseTS_DISTINCT_EVEN_NUMBERS ( arr , n ) :
    us = set ( )
    even_count = 0
    for i in range ( n ) :
        if arr [ i ] % 2 == 0 :
            us.add ( arr [ i ] )
    even_count = len ( us )
    return int ( math.pow ( 2 , even_count ) - 1 )

