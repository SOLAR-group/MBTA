import sys

def f_gold ( degree , n ) :
    deg_sum = 0
    for i in range ( n ) :
        deg_sum += degree [ i ]
    return ( 2 ** ( n - 1 ) == deg_sum )

if __name__ == '__main__':
    param = [
    ([2, 3, 1, 1, 1],5,),
    ([2, 2, 1, 1, 2],5,),
    ([2, 2, 1, 1, 1],5,),
    ([0,0,0,3,3,4],6,),
    ([-10, 12, 2],3,),
    ([1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0],19,),
    ([1, 6, 10, 13, 15, 17, 18, 23, 26, 28, 30, 32, 32, 33, 36, 39, 39, 41, 43, 50, 50, 51, 53, 54, 59, 59, 63, 63, 63, 66, 66, 71, 71, 74, 78, 89, 89, 93],30,),
    ([66, -96, -14, 74, -20],4,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],31,),
    ([97, 73, 87, 45, 64, 30, 53, 50, 62, 42, 28, 58, 31, 90],10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_GIVEN_DEGREES_VERTICES_REPRESENT_GRAPH_TREE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_GIVEN_DEGREES_VERTICES_REPRESENT_GRAPH_TREE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
