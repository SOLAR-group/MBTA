if __name__ == '__main__':
    param = [
    (27,),
    (72,),
    (13,),
    (83,),
    (75,),
    (33,),
    (57,),
    (51,),
    (10,),
    (1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_STRINGS_WITH_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
