====================
def f_gold ( coin , n , k ) :
    coin = sorted ( coin )
    coins_needed = int ( math.ceil ( 1.0 * n / ( k + 1 ) ) )
    ans = 0
    for i in range ( 0 , coins_needed - 1 ) :
        ans += coin [ i ]
    return ans

