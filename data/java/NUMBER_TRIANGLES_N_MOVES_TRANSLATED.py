====================
def number_TRIANGLES_N_MOVES ( n ) :
    answer = [ 1 ] * n + [ 1 ] * n
    for i in range ( 1 , n + 1 ) :
        answer [ i ] = answer [ i - 1 ] * 3 + 2
    return answer

