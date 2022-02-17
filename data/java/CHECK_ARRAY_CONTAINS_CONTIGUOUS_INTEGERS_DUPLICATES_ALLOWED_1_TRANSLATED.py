====================
def check_array_contains_contiguous_INTEGERS_DUPLICATES_ALLOWED_1 ( arr , n ) :
    us = set ( )
    for i in range ( n ) :
        us.add ( arr [ i ] )
    count = 1
    curr_ele = arr [ 0 ] - 1
    while us.count ( curr_ele ) == True :
        count += 1
        curr_ele -= 1
    curr_ele = arr [ 0 ] + 1
    while us.count ( curr_ele ) == True :
        count += 1
        curr_ele += 1
    return ( count , ( us , curr_ele ) )

