====================
def f_gold ( l ) :
    """
 Return the gold tree of a given node.

 Parameters
 -----
 l : int
 The number of nodes to return.

 Returns
 -----
 tree : np.ndarray
 The tree of nodes that are being searched for.
 """
    leaf_node_count = np.power ( 2 , l - 1 )
    sum_last_level = 0
    sum_last_level = ( leaf_node_count * ( leaf_node_count + 1 ) ) / 2
    sum = sum_last_level * l
    return sum

