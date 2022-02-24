if __name__ == '__main__':
    param = [
    (84,99,),
    (95,64,),
    (67,21,),
    (92,22,),
    (97,35,),
    (13,77,),
    (37,46,),
    (9,92,),
    (10,26,),
    (90,94,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_PARTITION_A_SET_INTO_K_SUBSETS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
