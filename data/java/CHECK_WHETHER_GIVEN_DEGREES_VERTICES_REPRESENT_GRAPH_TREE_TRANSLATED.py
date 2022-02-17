====================
def check_wheelTHER_GIVEN_DEGREES_VERTICES_REPRESENT_GRAPH_TREE ( degree , n ) :
    deg_sum = 0
    for i in range ( n ) :
        deg_sum += degree [ i ]
    return ( 2 ** ( n - 1 ) == deg_sum )

