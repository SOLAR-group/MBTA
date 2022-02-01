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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LEXICOGRAPHICALLY_NEXT_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LEXICOGRAPHICALLY_NEXT_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LEXICOGRAPHICALLY_NEXT_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
