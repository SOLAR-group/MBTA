if __name__ == '__main__':
    param = [
    ('m Dm YZ',),
    ('65 48 57 71',),
    ('01 010',),
    ('mT vhByi',),
    ('19 44 9 1',),
    ('0',),
    ('z vUi  ',),
    ('7 591 36643 9 055',),
    ('01',),
    ('ti YGaijPY',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PRINT_WORDS_STRING_REVERSE_ORDER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PRINT_WORDS_STRING_REVERSE_ORDER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
