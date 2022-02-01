if __name__ == '__main__':
    param = [
    ('ncYltuhSxEfG',),
    ('26615541616459',),
    ('0101',),
    ('hK',),
    ('422162103899',),
    ('0010',),
    ('zfcSh',),
    ('92',),
    ('0',),
    ('v',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
