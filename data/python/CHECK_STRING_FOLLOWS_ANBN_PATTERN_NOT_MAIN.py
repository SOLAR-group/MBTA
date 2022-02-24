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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
