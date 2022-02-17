====================
def f_gold ( arr , n , k ) :
    res = 0
    thi = [ ]
    pol = [ ]
    for i in range ( n ) :
        if arr [ i ] == 'P' :
            pol.append ( i )
        elif arr [ i ] == 'T' :
            thi.append ( i )
    l , r = 0 , 0
    while l < len ( thi ) and r < len ( pol ) :
        if abs ( thi [ l ] - pol [ r ] ) <= k :
            res += 1
            l += 1
            r += 1
        elif thi [ l ] < pol [ r ] :
            l += 1
        else :
            r += 1
    return res

