if __name__ == '__main__':
    param = [
        (91,),
        (52,),
        (78,),
        (51,),
        (65,),
        (39,),
        (42,),
        (12,),
        (56,),
        (98,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
