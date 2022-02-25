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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_PREFIX_ALSO_SUFFIX_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
