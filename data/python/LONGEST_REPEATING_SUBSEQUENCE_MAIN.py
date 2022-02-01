if __name__ == '__main__':
    param = [
    ('JxZFz',),
    ('7648992235770',),
    ('11100000',),
    ('cRN  SgYjPsctJ',),
    ('434',),
    ('1',),
    ('JRfZIAsbrPBZ',),
    ('03779368305592',),
    ('1111000',),
    ('BkULuIi',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LONGEST_REPEATING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LONGEST_REPEATING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LONGEST_REPEATING_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
