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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COST_BALANCE_PARANTHESES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
