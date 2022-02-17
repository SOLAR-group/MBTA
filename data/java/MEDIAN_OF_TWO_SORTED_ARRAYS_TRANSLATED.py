====================
def f_gold ( ar1 , ar2 , n ) :
    i = 0
    j = 0
    count = 0
    m1 , m2 = - 1 , - 1
    for count in range ( 0 , n ) :
        if i == n :
            m1 , m2 = m2 , ar2
            break
        elif j == n :
            m1 , m2 = m2 , ar1
            break
        if ar1 [ i ] < ar2 [ j ] :
            m1 , m2 = m2 , ar1
            i += 1
        else :
            m1 , m2 = m2 , ar2
            j += 1
    return ( m1 , m2 )

