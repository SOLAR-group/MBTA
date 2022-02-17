====================
def f_gold ( str , n ) :
    ans = ( n * ( n + 1 ) ) / 2
    a_index = 0
    b_index = 0
    c_index = 0
    for i in range ( n ) :
        if str [ i ] == 'a' :
            a_index = i + 1
            ans -= min ( b_index , c_index )
        elif str [ i ] == 'b' :
            b_index = i + 1
            ans -= min ( a_index , c_index )
        else :
            c_index = i + 1
            ans -= min ( a_index , b_index )
    return ans

