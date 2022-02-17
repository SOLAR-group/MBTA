====================
def f_gold ( n , m , k ) :
    if m <= n - k + 1 :
        return m + k - 1
    m = m - ( n - k + 1 )
    return ( m % n == 0 )

