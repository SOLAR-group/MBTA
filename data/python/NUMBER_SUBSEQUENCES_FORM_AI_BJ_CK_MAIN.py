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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
