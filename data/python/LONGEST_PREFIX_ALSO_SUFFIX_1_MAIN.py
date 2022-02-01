if __name__ == '__main__':
    param = [
    ('aabcdaabc',),
    ('1372494598',),
    ('110000100001',),
    ('abcab',),
    ('488938',),
    ('011010101011',),
    ('aaaa',),
    ('3356203205',),
    ('1010',),
    ('kkXiiTZkGeh',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
