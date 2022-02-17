====================
def f_gold ( a , n ) :
    """
 Return the number of gold elements in a.
 """
    cnt = { }
    ans , pre_sum = 0 , 0
    for i in range ( n ) :
        ans += ( i * a [ i ] ) - pre_sum
        pre_sum += a [ i ]
        if cnt.has_key ( a [ i ] - 1 ) :
            ans -= cnt [ a [ i ] - 1 ]
        if cnt.has_key ( a [ i ] + 1 ) :
            ans += cnt [ a [ i ] + 1 ]
        if cnt.has_key ( a [ i ] ) :
            cnt [ a [ i ] ] = cnt [ a [ i ] ] + 1
        else :
            cnt [ a [ i ] ] = 1
    return ans

