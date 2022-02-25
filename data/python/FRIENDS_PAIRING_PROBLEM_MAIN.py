if __name__ == '__main__':
    param = [
    (99,),
    (62,),
    (87,),
    (87,),
    (61,),
    (88,),
    (73,),
    (62,),
    (98,),
    (57,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FRIENDS_PAIRING_PROBLEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FRIENDS_PAIRING_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
