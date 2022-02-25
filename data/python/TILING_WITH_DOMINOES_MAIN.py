if __name__ == '__main__':
    param = [
    (29,),
    (13,),
    (25,),
    (65,),
    (27,),
    (42,),
    (19,),
    (50,),
    (59,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TILING_WITH_DOMINOES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
