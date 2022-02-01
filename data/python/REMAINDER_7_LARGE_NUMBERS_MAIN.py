if __name__ == '__main__':
    param = [
    ('K',),
    ('850076',),
    ('00111',),
    ('X',),
    ('1',),
    ('10010001100',),
    (' pgPeLz',),
    ('53212456821275',),
    ('101',),
    ('V',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("REMAINDER_7_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("REMAINDER_7_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("REMAINDER_7_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
