====================
def f_gold ( A , B , n ) :
    A = np.array ( A )
    B = np.array ( B )
    result = 0
    for i in range ( n ) :
        result += ( A [ i ] * B [ n - i - 1 ] )
    return result

