====================
def f_gold ( a , n ) :
    a = np.asarray ( a )
    sum = 0
    flag = False
    len = 0
    for i in range ( n ) :
        if ( a [ i ] == a [ i + 1 ] or a [ i ] - a [ i + 1 ] == 1 ) :
            flag = True
            len = a [ i + 1 ]
            i += 1
        elif ( a [ i ] == a [ i + 1 ] or a [ i ] - a [ i + 1 ] == 1 ) :
            sum = sum + a [ i + 1 ] * len
            flag = False
            i += 1
    return sum

