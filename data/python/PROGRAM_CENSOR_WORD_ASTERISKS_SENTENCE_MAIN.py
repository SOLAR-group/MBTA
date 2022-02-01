if __name__ == '__main__':
    param = [
    ('IggvAXtmJ','kzHdEJuCaO',),
    ('76711241128','5',),
    ('010','0101001',),
    ('HIKOn','XlnBwpx',),
    ('3680369217','017523',),
    ('1111','1011',),
    ('zIi','ONNXygON',),
    ('06','54171617',),
    ('111','0010001011001',),
    ('NJNnrVU','AGwmS',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
