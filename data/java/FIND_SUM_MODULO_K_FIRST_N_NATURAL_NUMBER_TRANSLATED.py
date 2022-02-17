====================
def f_gold ( N , K ) :
    """
 Return the number of gold symbols in the given number of symbols.
 """
    ans = 0
    for i in range ( 1 , N + 1 ) :
        ans += ( i % K )
    return ans

