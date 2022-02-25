if __name__ == '__main__':
    param = [
    (45,),
    (16,),
    (15,),
    (91,),
    (82,),
    (18,),
    (31,),
    (6,),
    (93,),
    (35,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_WHETHER_A_GIVEN_NUMBER_IS_A_POWER_OF_4_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
