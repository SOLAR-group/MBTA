if __name__ == '__main__':
    param = [
    (6,),
    (25,),
    (15,),
    (30,),
    (17,),
    (80,),
    (27,),
    (13,),
    (12,),
    (67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TRIANGULAR_MATCHSTICK_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
