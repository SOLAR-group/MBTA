====================
def f_gold ( arr , n , sum ) :
    prev_sum = { }
    res = 0
    currsum = 0
    for i in range ( n ) :
        currsum += arr [ i ]
        if currsum == sum :
            res += 1
        if prev_sum.has_key ( currsum - sum ) :
            res += prev_sum [ currsum - sum ]
        count = prev_sum.get ( currsum )
        if count is None :
            prev_sum [ currsum ] = 1
        else :
            prev_sum [ currsum ] = count + 1
    return res

