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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("REMOVE_BRACKETS_ALGEBRAIC_STRING_CONTAINING_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
