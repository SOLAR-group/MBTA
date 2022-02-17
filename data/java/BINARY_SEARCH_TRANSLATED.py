====================
def pythree_search ( arr , l , r , x ) :
    if r >= l :
        mid = l + ( r - l ) // 2
        if arr [ mid ] == x :
            return mid
        if arr [ mid ] > x :
            return pythree_search ( arr , l , mid - 1 , x )
        return pythree_search ( arr , mid + 1 , r , x )
    return - 1

