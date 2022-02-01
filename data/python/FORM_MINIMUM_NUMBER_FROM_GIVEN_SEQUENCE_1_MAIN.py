if __name__ == '__main__':
    param = [
    ('D',),
    ('I',),
    ('DD',),
    ('II',),
    ('DIDI',),
    ('IIDDD',),
    ('DDIDDIID',),
    ('176297',),
    ('1',),
    ('XHkhZq',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
