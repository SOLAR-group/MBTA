====================
def f_gold ( n ) :
    count = 0
    if n and ( n & ( n - 1 ) ) == 0 :
        return n
    while n != 0 :
        n >>= 1
        count += 1
    return 1 << count

