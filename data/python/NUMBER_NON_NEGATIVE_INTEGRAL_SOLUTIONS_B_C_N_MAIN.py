if __name__ == '__main__':
    param = [
    (62,),
    (44,),
    (37,),
    (81,),
    (14,),
    (20,),
    (76,),
    (72,),
    (96,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
