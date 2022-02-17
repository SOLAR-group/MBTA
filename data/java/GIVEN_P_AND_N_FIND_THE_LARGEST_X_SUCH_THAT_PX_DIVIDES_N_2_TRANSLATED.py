====================
def f_gold ( n , p ) :
    ans = 0
    while n > 0 :
        n /= p
        ans += n
    return ans

