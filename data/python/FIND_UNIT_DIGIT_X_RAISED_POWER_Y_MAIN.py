if __name__ == '__main__':
    param = [
    (33,55,),
    (95,7,),
    (21,63,),
    (3,62,),
    (40,53,),
    (64,24,),
    (17,23,),
    (58,74,),
    (44,13,),
    (27,54,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
