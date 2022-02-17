====================
def get_minimum_perimeter_n_blocks ( n ) :
    l = int ( math.sqrt ( n ) )
    sq = l ** 2
    if sq == n :
        return l ** 4
    else :
        row = n // l
        perimeter = 2 * ( l + row )
        if n % l != 0 :
            perimeter += 2
        return perimeter

