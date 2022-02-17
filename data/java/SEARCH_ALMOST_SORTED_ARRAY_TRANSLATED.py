====================
def search_almost_sort ( arr , l , r , x ) :
    if r >= l :
        mid = l + ( r - l ) // 2
        if arr [ mid ] == x :
            return mid
        if mid > l and arr [ mid - 1 ] == x :
            return ( mid - 1 )
        if mid < r and arr [ mid + 1 ] == x :
            return ( mid + 1 )
        if arr [ mid ] > x :
            return f_gold ( arr , l , mid - 2 , x )
        return f_gold ( arr , mid + 2 , r , x )
    return - 1

