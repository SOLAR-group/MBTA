if __name__ == '__main__':
    param = [
    (37,17,),
    (70,52,),
    (26,23,),
    (9,96,),
    (82,71,),
    (95,36,),
    (43,40,),
    (7,27,),
    (19,56,),
    (49,28,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_UNIT_DIGIT_X_RAISED_POWER_Y_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
