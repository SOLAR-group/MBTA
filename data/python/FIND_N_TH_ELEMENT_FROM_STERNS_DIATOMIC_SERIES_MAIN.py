if __name__ == '__main__':
    param = [
    (37,),
    (24,),
    (13,),
    (56,),
    (26,),
    (67,),
    (82,),
    (60,),
    (64,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_N_TH_ELEMENT_FROM_STERNS_DIATOMIC_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
