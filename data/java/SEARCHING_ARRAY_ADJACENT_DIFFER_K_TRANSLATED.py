====================
def f_gold ( arr , n , x , k ) :
    i = 0
    while i < n :
        if arr [ i ] == x :
            return i
        i = i + max ( 1 , abs ( arr [ i ] - x ) / k )
    print ( 'number is ' + 'not present!' )
    return - 1

