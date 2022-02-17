====================
def f_gold ( n , p ) :
    ans = 0
    for i in range ( 1 , n + 1 ) :
        count , temp = 0 , i
        while temp % p == 0 :
            count += 1
            temp = temp // p
        ans += count
    return ans

