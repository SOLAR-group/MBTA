if __name__ == '__main__':
    param = [
    (66,),
    (93,),
    (39,),
    (93,),
    (68,),
    (20,),
    (37,),
    (52,),
    (52,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
