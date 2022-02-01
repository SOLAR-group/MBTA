if __name__ == '__main__':
    param = [
    ('lLkhFeZGcb',),
    ('ABcED',),
    ('geeksforgeeks',),
    ('Alphabetical',),
    ('abababab',),
    ('bcdefgxyz',),
    ('cBzaqx L',),
    (' bcd',),
    ('11',),
    ('MqqKY',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
