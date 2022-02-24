if __name__ == '__main__':
    param = [
    (45,),
    (26,),
    (74,),
    (80,),
    (46,),
    (67,),
    (16,),
    (87,),
    (27,),
    (17,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("POSITION_OF_RIGHTMOST_SET_BIT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
