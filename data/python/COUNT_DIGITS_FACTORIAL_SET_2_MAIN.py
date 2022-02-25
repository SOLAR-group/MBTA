if __name__ == '__main__':
    param = [
    (56,),
    (92,),
    (52,),
    (96,),
    (96,),
    (63,),
    (51,),
    (79,),
    (70,),
    (9,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DIGITS_FACTORIAL_SET_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DIGITS_FACTORIAL_SET_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
