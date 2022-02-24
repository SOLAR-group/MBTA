if __name__ == '__main__':
    param = [
    (45,),
    (80,),
    (54,),
    (48,),
    (83,),
    (68,),
    (32,),
    (20,),
    (68,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_PERIMETER_N_BLOCKS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_PERIMETER_N_BLOCKS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
