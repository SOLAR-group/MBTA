import sys

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

if __name__ == '__main__':
    param = [
    (5,),
    (16,),
    (8,),
    (61,),
    (59,),
    (88,),
    (67,),
    (28,),
    (58,),
    (42,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_NODES_GIVEN_PERFECT_BINARY_TREE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
