====================
def f_gold ( n ) :
    N = 10
    count = 1
    for i in range ( 1 , n + 1 ) :
        count *= ( N + i - 1 )
        count /= i
    return count

