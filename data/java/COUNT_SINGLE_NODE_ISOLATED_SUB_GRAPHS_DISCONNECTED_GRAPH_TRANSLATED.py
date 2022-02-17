====================
def count_single_node_isolaTED_SUB_GRAPHS_DISCONNECTED_GRAPH ( graph , N ) :
    count = 0
    for i in range ( 1 , 7 ) :
        if graph [ i ] == 0 :
            count += 1
    return count

