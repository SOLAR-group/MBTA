if __name__ == '__main__':
    param = [
    ('vzTUaItpCpLnjY',),
    ('33855',),
    ('0011110101011',),
    ('MMQ',),
    ('439340517954',),
    ('000000000',),
    ('UugAuRRJbjEgl',),
    ('6406553695441',),
    ('011001',),
    ('yjFqEEvgiNjEX',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_LARGE_NUMBER_DIVISIBLE_13_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
