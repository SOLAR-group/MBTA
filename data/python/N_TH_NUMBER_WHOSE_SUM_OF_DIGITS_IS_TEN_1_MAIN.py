if __name__ == '__main__':
    param = [
    (93,),
    (10,),
    (55,),
    (94,),
    (2,),
    (5,),
    (37,),
    (4,),
    (11,),
    (46,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
