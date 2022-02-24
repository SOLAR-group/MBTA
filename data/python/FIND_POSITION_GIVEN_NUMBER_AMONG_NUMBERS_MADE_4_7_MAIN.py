if __name__ == '__main__':
    param = [
        ('7',),
        ('305745689',),
        ('444',),
        ('4',),
        ('2074',),
        ('27',),
        ('447',),
        ('255',),
        ('10000111111011',),
        ('fAKcSDRTNz',)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
