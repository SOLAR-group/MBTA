if __name__ == '__main__':
    param = [
    (27,59,),
    (70,87,),
    (77,40,),
    (83,26,),
    (16,2,),
    (90,66,),
    (39,72,),
    (48,26,),
    (56,77,),
    (10,47,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_WAYS_NODE_MAKE_LOOP_SIZE_K_UNDIRECTED_COMPLETE_CONNECTED_GRAPH_N_NODES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_WAYS_NODE_MAKE_LOOP_SIZE_K_UNDIRECTED_COMPLETE_CONNECTED_GRAPH_N_NODES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_WAYS_NODE_MAKE_LOOP_SIZE_K_UNDIRECTED_COMPLETE_CONNECTED_GRAPH_N_NODES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")