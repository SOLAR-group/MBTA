if __name__ == '__main__':
    param = [
    ('()',),
    ('))((',),
    ('())',),
    ('(()',),
    ('(()()())',),
    ('))())(()(())',),
    ('))(())((',),
    ('49',),
    ('00001111',),
    ('KDahByG ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
