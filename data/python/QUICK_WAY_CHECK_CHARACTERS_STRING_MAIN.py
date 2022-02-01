if __name__ == '__main__':
    param = [
    ('',),
    ('ggg',),
    ('11',),
    ('KoYIHns',),
    ('232',),
    ('10111000011101',),
    ('DDDD',),
    ('11',),
    ('11111',),
    ('ewJvixQzu',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("QUICK_WAY_CHECK_CHARACTERS_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("QUICK_WAY_CHECK_CHARACTERS_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("QUICK_WAY_CHECK_CHARACTERS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
