====================
def f_gold ( n ) :
    import sys
    if n > 0 and ( n & ( n - 1 ) ) == 0 :
        return n
    while p < n :
        p <<= 1
    return p

