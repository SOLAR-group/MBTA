if __name__ == '__main__':
    param = [
    (8,),
    (79,),
    (31,),
    (63,),
    (18,),
    (2,),
    (6,),
    (85,),
    (29,),
    (8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
