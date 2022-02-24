if __name__ == '__main__':
    param = [
    (21,),
    (4,),
    (31,),
    (79,),
    (38,),
    (75,),
    (36,),
    (32,),
    (23,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_OF_ALL_ELEMENTS_UP_TO_NTH_ROW_IN_A_PASCALS_TRIANGLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
