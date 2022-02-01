if __name__ == '__main__':
    param = [
    ('smnKL',),
    ('270083',),
    ('0',),
    ('kcZdsz',),
    ('483544224',),
    ('000011',),
    ('WysGCirMwKBzP',),
    ('3366',),
    ('110',),
    ('NlaMkpCjUgg',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
