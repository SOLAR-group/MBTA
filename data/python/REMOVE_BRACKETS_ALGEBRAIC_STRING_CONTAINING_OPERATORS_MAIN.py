if __name__ == '__main__':
    param = [
    ('ggbsMvMZcMOVd',),
    ('384292670',),
    ('10000100',),
    ('fdHME',),
    ('09198832',),
    ('0011111011',),
    ('SnXwRS',),
    ('071',),
    ('01101',),
    ('xwmqxgBa',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
