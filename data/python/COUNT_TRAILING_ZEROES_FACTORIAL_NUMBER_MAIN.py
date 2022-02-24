if __name__ == '__main__':
    param = [
    (9,),
    (43,),
    (50,),
    (32,),
    (37,),
    (51,),
    (33,),
    (49,),
    (1,),
    (75,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_TRAILING_ZEROES_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_TRAILING_ZEROES_FACTORIAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
