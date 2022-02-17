====================
def f_gold ( arr , n ) :
    lioes = [ ]
    max_len = 0
    for i in range ( n ) :
        lioes.append ( 1 )
    for i in range ( 1 , n ) :
        for j in range ( 0 , i ) :
            if arr [ i ] > arr [ j ] and ( arr [ i ] + arr [ j ] ) % 2 != 0 and lioes [ i ] < lioes [ j ] + 1 :
                lioes [ i ] = lioes [ j ] + 1
        for i in range ( n ) :
            if max_len < lioes [ i ] :
                max_len = lioes [ i ]
        return max_len

