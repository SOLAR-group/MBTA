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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LENGTH_LONGEST_SUB_STRING_CAN_MAKE_REMOVED," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LENGTH_LONGEST_SUB_STRING_CAN_MAKE_REMOVED," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LENGTH_LONGEST_SUB_STRING_CAN_MAKE_REMOVED," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
