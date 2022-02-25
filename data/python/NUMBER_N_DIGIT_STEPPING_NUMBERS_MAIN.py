if __name__ == '__main__':
    param = [
    (18,),
    (66,),
    (73,),
    (70,),
    (26,),
    (41,),
    (20,),
    (25,),
    (52,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_N_DIGIT_STEPPING_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_N_DIGIT_STEPPING_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
