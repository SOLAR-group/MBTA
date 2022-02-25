if __name__ == '__main__':
    param = [
    (67,),
    (77,),
    (35,),
    (79,),
    (45,),
    (22,),
    (68,),
    (17,),
    (5,),
    (85,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_IF_A_NUMBER_IS_JUMBLED_OR_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
