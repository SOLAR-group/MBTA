if __name__ == '__main__':
    param = [
    ('mhjnKfd','l',),
    ('716662107','6',),
    ('01','1',),
    ('wPHSxIbnHakGRO','n',),
    ('721106','8',),
    ('111','0',),
    ('TIBFU','Q',),
    ('0','3',),
    ('10','0',),
    ('lqq','d',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_COUNT_OCCURRENCE_GIVEN_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
