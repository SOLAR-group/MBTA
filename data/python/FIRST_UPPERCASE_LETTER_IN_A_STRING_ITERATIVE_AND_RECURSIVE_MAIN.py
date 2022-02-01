if __name__ == '__main__':
    param = [
    ('pH',),
    ('96544000',),
    ('000010000',),
    ('ujqpx',),
    ('20684847994',),
    ('111',),
    ('rclkv',),
    ('45173693434',),
    ('11111011001101',),
    ('f',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIRST_UPPERCASE_LETTER_IN_A_STRING_ITERATIVE_AND_RECURSIVE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
