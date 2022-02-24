if __name__ == '__main__':
    param = [
    (2,),
    (39,),
    (31,),
    (45,),
    (35,),
    (94,),
    (67,),
    (50,),
    (4,),
    (63,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMIZE_THE_SUM_OF_DIGITS_OF_A_AND_B_SUCH_THAT_A_B_N," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMIZE_THE_SUM_OF_DIGITS_OF_A_AND_B_SUCH_THAT_A_B_N," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
