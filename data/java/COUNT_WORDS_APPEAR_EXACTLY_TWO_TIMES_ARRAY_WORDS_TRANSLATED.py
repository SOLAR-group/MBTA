====================
def f_gold ( str , n ) :
    m = { }
    for i in range ( n ) :
        if m.has_key ( str [ i ] ) :
            get = m [ str [ i ] ]
            m [ str [ i ] ] = get + 1
        else :
            m [ str [ i ] ] = 1
    res = 0
    for key , value in m.items ( ) :
        if value == 2 :
            res += 1
    return res

