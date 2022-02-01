if __name__ == '__main__':
    param = [
    ('',),
    ('abbc',),
    ('abcabc',),
    ('agsdbkfdc ',),
    ('ababab',),
    ('aaaaaaa',),
    ('aabaaabcc',),
    ('19',),
    ('1001100',),
    ('DtAnuQbU',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
