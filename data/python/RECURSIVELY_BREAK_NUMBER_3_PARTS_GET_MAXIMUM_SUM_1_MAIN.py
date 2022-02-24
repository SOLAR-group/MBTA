if __name__ == '__main__':
    param = [
    (50,),
    (83,),
    (18,),
    (24,),
    (31,),
    (38,),
    (94,),
    (24,),
    (13,),
    (53,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
