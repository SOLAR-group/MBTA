if __name__ == '__main__':
    param = [
    (17,),
    (97,),
    (73,),
    (68,),
    (6,),
    (84,),
    (72,),
    (66,),
    (57,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
