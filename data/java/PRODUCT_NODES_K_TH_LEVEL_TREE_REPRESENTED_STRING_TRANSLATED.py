====================
def product_nodes_k_th_level_tree_repr_string ( tree , k ) :
    level = - 1
    product = 1
    n = len ( tree )
    for i in range ( n ) :
        if tree [ i ] == '(' :
            level += 1
        elif tree [ i ] == ')' :
            level -= 1
        else :
            if level == k :
                product *= ( tree [ i ] - '0' )
    return product

