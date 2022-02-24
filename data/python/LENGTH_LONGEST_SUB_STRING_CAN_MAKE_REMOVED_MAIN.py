if __name__ == '__main__':
    param = [
    ('U',),
    ('544',),
    ('111',),
    (' cDQaNxpRSOe',),
    ('42920062459',),
    ('00100101',),
    ('FiC',),
    ('302746335230',),
    ('1',),
    ('ZBLHiwGreUR ',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LENGTH_LONGEST_SUB_STRING_CAN_MAKE_REMOVED," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LENGTH_LONGEST_SUB_STRING_CAN_MAKE_REMOVED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
