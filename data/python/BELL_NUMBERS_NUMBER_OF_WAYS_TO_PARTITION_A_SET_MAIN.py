if __name__ == '__main__':
    param = [
    (84,),
    (78,),
    (9,),
    (73,),
    (4,),
    (53,),
    (85,),
    (38,),
    (39,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BELL_NUMBERS_NUMBER_OF_WAYS_TO_PARTITION_A_SET," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
