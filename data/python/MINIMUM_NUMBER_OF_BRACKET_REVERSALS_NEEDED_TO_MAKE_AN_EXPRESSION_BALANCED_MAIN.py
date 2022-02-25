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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_NUMBER_OF_BRACKET_REVERSALS_NEEDED_TO_MAKE_AN_EXPRESSION_BALANCED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
