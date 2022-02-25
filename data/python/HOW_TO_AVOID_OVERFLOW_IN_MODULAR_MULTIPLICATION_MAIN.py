if __name__ == '__main__':
    param = [
    (99,75,40,),
    (11,4,41,),
    (51,37,23,),
    (49,51,88,),
    (9,34,30,),
    (90,85,55,),
    (19,96,41,),
    (17,96,37,),
    (54,3,51,),
    (5,69,60,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HOW_TO_AVOID_OVERFLOW_IN_MODULAR_MULTIPLICATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HOW_TO_AVOID_OVERFLOW_IN_MODULAR_MULTIPLICATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
