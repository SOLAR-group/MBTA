====================
def dyCK_path ( n ) :
    res = 1
    for i in range ( n ) :
        res *= ( 2 ** n - i )
        res /= ( i + 1 )
    return res / ( n + 1 )

