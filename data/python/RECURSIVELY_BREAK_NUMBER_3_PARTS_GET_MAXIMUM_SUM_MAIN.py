if __name__ == '__main__':
    param = [
    (39,),
    (79,),
    (7,),
    (76,),
    (48,),
    (18,),
    (58,),
    (17,),
    (36,),
    (5,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
