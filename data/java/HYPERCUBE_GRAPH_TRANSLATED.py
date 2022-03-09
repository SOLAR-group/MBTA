import sys

def f_gold ( n ) :
    if n == 1 :
        return 2
    return 2 * f_gold ( n - 1 )

if __name__ == '__main__':
    param = [
    (72,),
    (28,),
    (45,),
    (41,),
    (94,),
    (97,),
    (97,),
    (36,),
    (91,),
    (84,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
