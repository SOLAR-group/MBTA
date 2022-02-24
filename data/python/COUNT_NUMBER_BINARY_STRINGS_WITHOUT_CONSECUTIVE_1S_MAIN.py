if __name__ == '__main__':
    param = [
    (86,),
    (75,),
    (14,),
    (5,),
    (41,),
    (35,),
    (30,),
    (89,),
    (84,),
    (53,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
