if __name__ == '__main__':
    param = [
    (43,),
    (94,),
    (72,),
    (86,),
    (42,),
    (33,),
    (8,),
    (74,),
    (29,),
    (34,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SET_BITS_IN_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
