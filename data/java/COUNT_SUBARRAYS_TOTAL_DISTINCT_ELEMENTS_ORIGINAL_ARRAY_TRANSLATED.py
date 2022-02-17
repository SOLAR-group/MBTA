====================
def f_gold ( arr , n ) :
    vis = { }
    for key in arr :
        vis [ arr [ key ] ] = 1
    k = len ( vis )
    vis.clear ( )
    ans , right , window = 0 , 0 , 0
    for left in range ( n ) :
        while right < n and window < k :
            vis [ arr [ right ] ] = vis [ arr [ right ] ] + 1
            if vis [ arr [ right ] ] == 1 :
                window += 1
            right += 1
        if window == k :
            ans += ( n - right + 1 )
        vis [ arr [ left ] ] = vis [ arr [ left ] ] - 1
        if vis [ arr [ left ] ] == 0 :
            window -= 1
    return ans

