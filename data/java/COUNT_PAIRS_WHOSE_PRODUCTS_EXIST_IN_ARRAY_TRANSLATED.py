====================
def count_pairs_whose_products_exist_in_array ( arr , n ) :
    result = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            product = arr [ i ] * arr [ j ]
            for k in range ( n ) :
                if arr [ k ] == product :
                    result += 1
                    break
    return result

