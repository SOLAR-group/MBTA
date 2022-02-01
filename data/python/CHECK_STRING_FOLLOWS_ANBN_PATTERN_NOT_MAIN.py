if __name__ == '__main__':
    param = [
    ('ba',),
    ('aabb',),
    ('abab',),
    ('aaabb',),
    ('aabbb',),
    ('abaabbaa',),
    ('abaababb',),
    ('bbaa',),
    ('11001000',),
    ('ZWXv te',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
