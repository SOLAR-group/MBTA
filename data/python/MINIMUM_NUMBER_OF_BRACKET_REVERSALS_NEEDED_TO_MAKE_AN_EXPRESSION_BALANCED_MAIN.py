if __name__ == '__main__':
    param = [
    ('}{',),
    ('{{{',),
    ('{{{{',),
    ('{{{{}}',),
    ('}{{}}{{{',),
    ('{}',),
    ('',),
    ('8',),
    ('01111000',),
    ('XPkERzHcpId',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
