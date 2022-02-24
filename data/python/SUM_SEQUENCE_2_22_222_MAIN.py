if __name__ == '__main__':
    param = [
    (88,),
    (79,),
    (7,),
    (36,),
    (23,),
    (10,),
    (27,),
    (30,),
    (71,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SEQUENCE_2_22_222," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
