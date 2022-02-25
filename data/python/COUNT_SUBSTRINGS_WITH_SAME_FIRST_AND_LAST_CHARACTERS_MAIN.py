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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_SUBSTRINGS_WITH_SAME_FIRST_AND_LAST_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
