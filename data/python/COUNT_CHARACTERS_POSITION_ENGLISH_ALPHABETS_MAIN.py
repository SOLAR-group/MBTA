if __name__ == '__main__':
    param = [
    ('lLkhFeZGcb',),
    ('ABcED',),
    ('geeksforgeeks',),
    ('Alphabetical',),
    ('abababab',),
    ('bcdefgxyz',),
    ('cBzaqx L',),
    (' bcd',),
    ('11',),
    ('MqqKY',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
