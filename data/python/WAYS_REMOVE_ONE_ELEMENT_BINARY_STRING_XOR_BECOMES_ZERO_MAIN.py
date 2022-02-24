if __name__ == '__main__':
    param = [
    ('KfcTJNP',),
    ('05312505872',),
    ('100111',),
    ('tDEEhKxrQ',),
    ('50824233019',),
    ('10001110010',),
    ('T SEZaNm MYQ',),
    ('838415739',),
    ('01110100',),
    ('WYQiAey H',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("WAYS_REMOVE_ONE_ELEMENT_BINARY_STRING_XOR_BECOMES_ZERO," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WAYS_REMOVE_ONE_ELEMENT_BINARY_STRING_XOR_BECOMES_ZERO," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
