if __name__ == '__main__':
    param = [
    (20,),
    (6,),
    (39,),
    (80,),
    (88,),
    (7,),
    (16,),
    (27,),
    (83,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_ODD_FACTORS_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
