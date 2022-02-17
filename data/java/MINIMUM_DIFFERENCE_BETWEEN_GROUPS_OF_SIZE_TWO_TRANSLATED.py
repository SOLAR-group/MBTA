====================
def f_gold ( a , n ) :
    a = np.asarray ( a )
    i , j = np.where ( a == 1 )
    s = [ ( a [ i ] + a [ j ] ) for i , j in np.where ( a == 2 ) ]
    mini = np.min ( s )
    maxi = np.max ( s )
    return abs ( maxi - mini )

