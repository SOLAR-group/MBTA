====================
def f_gold ( arr , n ) :
    res = 0
    m = { }
    for i in range ( n ) :
        sum = 0
        for j in range ( i , n ) :
            sum += arr [ j ]
            if m.has_key ( sum ) :
                m [ sum ] = m [ sum ] + 1
            else :
                m [ sum ] = 1
    for x , y in m.items ( ) :
        if y == 1 :
            res += x
    return res

