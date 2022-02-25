if __name__ == '__main__':
    param = [
    (34,),
    (56,),
    (90,),
    (47,),
    (36,),
    (63,),
    (21,),
    (76,),
    (18,),
    (75,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CIRCLE_LATTICE_POINTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
