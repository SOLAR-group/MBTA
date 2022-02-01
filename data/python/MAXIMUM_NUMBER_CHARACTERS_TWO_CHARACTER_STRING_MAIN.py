if __name__ == '__main__':
    param = [
    ('cI',),
    ('76478',),
    ('1',),
    ('tr',),
    ('10',),
    ('01',),
    ('Rmhzp',),
    ('5784080133917',),
    ('1100',),
    ('OK',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
