if __name__ == '__main__':
    param = [
        (50, 60,),
        (52, 45,),
        (42, 17,),
        (2, 68,),
        (37, 43,),
        (48, 46,),
        (31, 4,),
        (9, 64,),
        (78, 14,),
        (64, 80,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NTH_MULTIPLE_NUMBER_FIBONACCI_SERIES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
