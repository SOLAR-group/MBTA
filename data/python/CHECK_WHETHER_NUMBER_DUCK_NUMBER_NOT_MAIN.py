if __name__ == '__main__':
    param = [
    ('HLlQWSphZcIC',),
    ('080287724',),
    ('0000100000',),
    (' Q',),
    ('4247040983',),
    ('00001011101',),
    ('LbNsnYTHmLbCf',),
    ('24',),
    ('110',),
    ('ie',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_WHETHER_NUMBER_DUCK_NUMBER_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
