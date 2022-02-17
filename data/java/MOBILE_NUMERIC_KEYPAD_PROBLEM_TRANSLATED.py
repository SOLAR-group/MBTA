====================
def f_gold ( keypad = None , n = 10 ) :
    if keypad is None or n <= 0 :
        return 0
    if n == 1 :
        return 10
    odd = [ ]
    even = [ ]
    i = 0 , 0 , 0 , 0
    useOdd , totalCount = 0 , 0 , 0
    for i in range ( 0 , 9 ) :
        odd.append ( 1 )
    for j in range ( 2 , n ) :
        useOdd = 1 - useOdd
        if useOdd == 1 :
            even.append ( odd [ 0 ] + odd [ 8 ] )
            even.append ( odd [ 1 ] + odd [ 2 ] + odd [ 4 ] )
            even.append ( odd [ 2 ] + odd [ 1 ] + odd [ 3 ] + odd [ 5 ] )
            even.append ( odd [ 3 ] + odd [ 2 ] + odd [ 6 ] )
            even.append ( odd [ 4 ] + odd [ 1 ] + odd [ 5 ] + odd [ 7 ] )
            even.append ( odd [ 5 ] + odd [ 2 ] + odd [ 4 ] + odd [ 8 ] + odd [ 6 ] )
            even.append ( odd [ 6 ] + odd [ 3 ] + odd [ 5 ] + odd [ 9 ] )
            even.append ( odd [ 7 ] + odd [ 4 ] + odd [ 8 ] )
            even.append ( odd [ 8 ] + odd [ 0 ] + odd [ 5 ] + odd [ 7 ] + odd [ 9 ] )
            even.append ( odd [ 9 ] + odd [ 4 ] + odd [ 8 ] )
            even.append ( odd [ 8 ] + odd [ 0 ] + odd [ 5 ] + odd [ 7 ] + odd [ 9 ] )
            even.append ( odd [ 9 ] + odd [ 6 ] + odd [ 8 ] )
        else :
            odd.append ( even [ 0 ] + even [ 8 ] )
            odd.append ( even [ 1 ] + even [ 2 ] + even [ 4 ] )
            odd.append ( even [ 2 ] + even [ 1 ] + even [ 3 ] + even [ 5 ] )
            odd.append ( even [ 3 ] + even [ 2 ] + even [ 6 ] )
            odd.append ( even [ 4 ] + even [ 5 ] + odd [ 7 ] )
    return
