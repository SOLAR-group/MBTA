====================
def check_two_given_circles ( x1 , y1 , x2 , y2 , r1 , r2 ) :
    distSq = ( x1 - x2 ) ** 2 + ( y1 - y2 ) ** 2
    radSumSq = ( r1 + r2 ) ** 2
    if distSq == radSumSq :
        return 1
    elif distSq > radSumSq :
        return - 1
    else :
        return 0

