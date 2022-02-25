if __name__ == '__main__':
    param = [
    ('cI',),
    ('76478',),
    ('1',),
    ('tr',),
    ('10',),
    ('01',),
    ('Rmhzp',),
    ('5784080133917',),
    ('1100',),
    ('OK',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
