if __name__ == '__main__':
    param = [
    ('qnQxjoRx',),
    ('27473733400077',),
    ('000010111111',),
    ('TNVwgrWSLu',),
    ('9537',),
    ('1100',),
    ('lYcoiQfzN',),
    ('52',),
    ('00100001100',),
    ('Rkxe',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LONGEST_REPEATED_SUBSEQUENCE_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LONGEST_REPEATED_SUBSEQUENCE_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LONGEST_REPEATED_SUBSEQUENCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
