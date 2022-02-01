if __name__ == '__main__':
    param = [
    ('LZIKA',),
    ('0556979952',),
    ('110010',),
    ('kGaYfd',),
    ('413567670657',),
    ('01001',),
    ('EQPuFa',),
    ('48848378',),
    ('110',),
    ('PLehNeP',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
