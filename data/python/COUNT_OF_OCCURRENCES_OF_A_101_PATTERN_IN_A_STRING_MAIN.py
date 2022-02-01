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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
