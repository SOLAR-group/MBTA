====================
def f_gold ( a , b , n ) :
    a = np.asarray ( a )
    b = np.asarray ( b )
    result = 0
    for i in range ( n ) :
        if a [ i ] > b [ i ] :
            result = result + abs ( a [ i ] - b [ i ] )
        elif a [ i ] < b [ i ] :
            result = result + abs ( a [ i ] - b [ i ] )
    return result

