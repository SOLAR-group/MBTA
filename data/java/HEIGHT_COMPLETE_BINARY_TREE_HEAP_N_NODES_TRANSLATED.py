import sys

def f_gold ( N ) :
    return int ( math.ceil ( math.log ( N + 1 ) / math.log ( 2 ) ) - 1 )

if __name__ == '__main__':
    param = [
        (65,),
        (94,),
        (52,),
        (31,),
        (9,),
        (1,),
        (41,),
        (98,),
        (45,),
        (24,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HEIGHT_COMPLETE_BINARY_TREE_HEAP_N_NODES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
