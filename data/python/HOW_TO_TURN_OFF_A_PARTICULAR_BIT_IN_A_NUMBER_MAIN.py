if __name__ == '__main__':
    param = [
    (49,15,),
    (59,69,),
    (76,20,),
    (27,76,),
    (61,60,),
    (67,27,),
    (63,71,),
    (85,25,),
    (90,64,),
    (24,55,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
