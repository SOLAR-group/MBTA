====================
def f_gold ( arr , n , k ) :
    pq = PriorityQueue ( )
    for i in range ( n ) :
        pq.add ( arr [ i ] )
    count , ans = 0 , 1
    while pq.empty ( ) == False and count < k :
        ans = ans * pq.element ( )
        pq.remove ( )
        count += 1
    return ans

