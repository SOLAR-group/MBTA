if __name__ == '__main__':
    param = [
    (54,83,),
    (42,56,),
    (63,12,),
    (19,76,),
    (41,50,),
    (7,26,),
    (39,42,),
    (11,64,),
    (96,81,),
    (15,54,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_HARMONIC_MEAN_USING_ARITHMETIC_MEAN_GEOMETRIC_MEAN," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_HARMONIC_MEAN_USING_ARITHMETIC_MEAN_GEOMETRIC_MEAN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
