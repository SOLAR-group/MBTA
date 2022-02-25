if __name__ == '__main__':
    param = [
    ('Qaq',),
    ('9400761825850',),
    ('0011001111',),
    ('lasWqrLRq',),
    ('5662',),
    ('110',),
    (' tOYKf',),
    ('6536991235305',),
    ('11111',),
    ('uZftT iDHcYiCt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
