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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HYPERCUBE_GRAPH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
