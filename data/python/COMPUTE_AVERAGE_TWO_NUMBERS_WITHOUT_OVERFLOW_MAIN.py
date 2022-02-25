if __name__ == '__main__':
    param = [
    (1,44,),
    (6,61,),
    (75,20,),
    (51,17,),
    (19,25,),
    (82,98,),
    (72,21,),
    (48,41,),
    (12,17,),
    (41,80,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
