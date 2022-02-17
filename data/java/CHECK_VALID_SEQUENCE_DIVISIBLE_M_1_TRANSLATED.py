====================
def check_valid_SEQUENCE_DIVISIBLE_M_1 ( n , index , modulo , M , arr , dp ) :
    modulo = ( ( modulo % M ) + M ) % M
    if index == n :
        if modulo == 0 :
            return 1
        return 0
    if dp [ index ] != - 1 :
        return dp [ index ]
    place_add = f_gold ( n , index + 1 , modulo + arr [ index ] , M , arr , dp )
    place_minus = f_gold ( n , index + 1 , modulo - arr [ index ] , M , arr , dp )
    res = place_add
    dp [ index ] = res
    return res

