if __name__ == '__main__':
    param = [
    ("00001",),
    ("0000",),
    ("11",),
    ("111110",),
    ("1",),
    ("111010111010",),
    ("hUInqJXNdbfP",),
    ("5191",),
    ("1110101101",),
    ('NupSrU xz',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHANGE_BITS_CAN_MADE_ONE_FLIP," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHANGE_BITS_CAN_MADE_ONE_FLIP," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHANGE_BITS_CAN_MADE_ONE_FLIP," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
