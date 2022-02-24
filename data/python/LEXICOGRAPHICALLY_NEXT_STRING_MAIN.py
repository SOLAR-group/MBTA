if __name__ == '__main__':
    param = [
    ('amKIRzPiqLTIy',),
    ('68',),
    ('100',),
    ('f',),
    ('802205375',),
    ('0111',),
    ('GRjRYIvYwgua',),
    ('8139910006809',),
    ('100101',),
    ('rw',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICALLY_NEXT_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICALLY_NEXT_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
