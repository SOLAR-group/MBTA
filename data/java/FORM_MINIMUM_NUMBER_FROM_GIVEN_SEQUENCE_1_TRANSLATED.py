====================
def form_minimum_number_from_given_SEQUENCE_1 ( seq ) :
    n = len ( seq )
    if n >= 9 :
        return "-1"
    result = [ ]
    count = 1
    for i in range ( 0 , n + 1 ) :
        if i == n or seq [ i ] == 'I' :
            for j in range ( i - 1 , - 1 , - 1 ) :
                result.append ( chr ( int ( '0' + count , 16 ) ) )
                if j >= 0 and seq [ j ] == 'I' :
                    break
    return ''.join ( result )

