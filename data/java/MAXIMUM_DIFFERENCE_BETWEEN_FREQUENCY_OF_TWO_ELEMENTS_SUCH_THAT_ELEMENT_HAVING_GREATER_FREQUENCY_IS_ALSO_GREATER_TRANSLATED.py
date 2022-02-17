====================
def f_gold ( arr , n ) :
    freq = { }
    for i in range ( n ) :
        freq [ arr [ i ] ] = freq [ arr [ i ] ] if i in freq else 1
    ans = 0
    for i in range ( n ) :
        for j in range ( n ) :
            if freq [ arr [ i ] ] > freq [ arr [ j ] ] and arr [ i ] > arr [ j ] :
                ans = max ( ans , freq [ arr [ i ] ] - freq [ arr [ j ] ] )
            elif freq [ arr [ i ] ] < freq [ arr [ j ] ] and arr [ i ] < arr [ j ] :
                ans = max ( ans , freq [ arr [ j ] ] - freq [ arr [ i ] ] )
    return ans

