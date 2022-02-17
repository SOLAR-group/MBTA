====================
def f_gold ( n ) :
    if n <= 1 :
        print ( "False" )
    if n <= 3 :
        print ( "False" )
    if n % 2 == 0 or n % 3 == 0 :
        return True
    for i in range ( 5 , i * i <= n , 6 ) :
        if n % i == 0 or n % ( i + 2 ) == 0 :
            return True
    return False

