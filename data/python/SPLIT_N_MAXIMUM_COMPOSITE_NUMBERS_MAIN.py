if __name__ == '__main__':
    param = [
        (55,),
        (35,),
        (24,),
        (75,),
        (5,),
        (7,),
        (50,),
        (28,),
        (67,),
        (59,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SPLIT_N_MAXIMUM_COMPOSITE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
