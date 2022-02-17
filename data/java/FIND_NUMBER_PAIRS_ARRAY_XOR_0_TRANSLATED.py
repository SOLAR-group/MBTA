====================
def find_number_pairs_array_xor_0 ( a , n ) :
    a = np.array ( a )
    count = 1
    answer = 0
    for i in range ( 1 , n ) :
        if a [ i ] == a [ i - 1 ] :
            count += 1
        else :
            answer = answer + ( count * ( count - 1 ) ) / 2
            count = 1
    answer = answer + ( count * ( count - 1 ) ) / 2
    return answer

