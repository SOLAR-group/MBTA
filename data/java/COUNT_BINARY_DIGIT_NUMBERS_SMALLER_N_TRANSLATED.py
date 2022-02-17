====================
def count_binary_digit_numberS_SMALLER_N ( N ) :
    q = Queue ( )
    q.put ( 1 )
    cnt = 0
    t = None
    while len ( q ) > 0 :
        t = q.get ( )
        q.put ( t )
        if t <= N :
            cnt += 1
            q.put ( t * 10 )
            q.put ( t * 10 + 1 )
    return cnt

