if __name__ == '__main__':
    param = [
    ('1001ab010abc01001',),
    ('1001010001',),
    ('010100010100',),
    ('DLCu',),
    ('7072430592',),
    ('011',),
    ('pnJpypYOza',),
    ('1037',),
    ('111',),
    ('HxK',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
