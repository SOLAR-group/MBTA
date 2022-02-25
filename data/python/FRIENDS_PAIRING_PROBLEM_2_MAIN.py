if __name__ == '__main__':
    param = [
    (24,),
    (1,),
    (91,),
    (90,),
    (89,),
    (29,),
    (3,),
    (60,),
    (75,),
    (14,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FRIENDS_PAIRING_PROBLEM_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FRIENDS_PAIRING_PROBLEM_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
