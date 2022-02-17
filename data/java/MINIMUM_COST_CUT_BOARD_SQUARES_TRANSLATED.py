====================
def f_gold ( X , Y , m , n ) :
    res = 0
    X = sorted ( X , key = lambda x : x [ 1 ] )
    Y = sorted ( Y , key = lambda x : x [ 1 ] )
    hzntl , vert = 1 , 1
    i , j = 0 , 0
    while i < m and j < n :
        if X [ i ] > Y [ j ] :
            res += X [ i ] * vert
            hzntl += 1
            i += 1
        else :
            res += Y [ j ] * hzntl
            vert += 1
            j += 1
    total = 0
    while i < m :
        total += X [ i ]
    res += total * vert
    total = 0
    while j < n :
        total += Y [ j ]
    res += total * hzntl
    return res

