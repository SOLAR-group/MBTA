if __name__ == '__main__':
    param = [
    (52,29,),
    (36,94,),
    (12,6,),
    (69,7,),
    (45,11,),
    (7,51,),
    (45,55,),
    (62,86,),
    (96,63,),
    (89,12,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("STEINS_ALGORITHM_FOR_FINDING_GCD_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
