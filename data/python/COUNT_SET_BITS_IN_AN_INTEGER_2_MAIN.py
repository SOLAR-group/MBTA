if __name__ == '__main__':
    param = [
    (32,),
    (94,),
    (33,),
    (99,),
    (17,),
    (64,),
    (80,),
    (42,),
    (12,),
    (86,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
