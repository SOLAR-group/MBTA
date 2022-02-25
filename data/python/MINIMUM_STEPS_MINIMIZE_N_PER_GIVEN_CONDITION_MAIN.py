if __name__ == '__main__':
    param = [
    (59,),
    (7,),
    (90,),
    (78,),
    (49,),
    (15,),
    (45,),
    (56,),
    (7,),
    (70,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
