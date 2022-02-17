====================
def f_gold ( arr , n , k ) :
    um = { }
    mod_arr = [ ]
    max = 0
    curr_sum = 0
    for i in range ( n ) :
        curr_sum += arr [ i ]
        mod_arr.append ( ( ( curr_sum % k ) + k ) % k )
    for i in range ( n ) :
        if mod_arr [ i ] == 0 :
            max = i + 1
        elif um.has_key ( mod_arr [ i ] ) == False :
            um [ mod_arr [ i ] ] = i
        elif max < ( i - um [ mod_arr [ i ] ] ) :
            max = i - um [ mod_arr [ i ] ]
    return max

