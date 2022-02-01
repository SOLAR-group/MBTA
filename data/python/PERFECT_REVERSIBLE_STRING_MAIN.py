if __name__ == '__main__':
    param = [
    ('ab',),
    ('303',),
    ('11110000',),
    ('aba',),
    ('404',),
    ('10101',),
    ('abab',),
    ('6366',),
    ('001',),
    ('',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PERFECT_REVERSIBLE_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PERFECT_REVERSIBLE_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PERFECT_REVERSIBLE_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
