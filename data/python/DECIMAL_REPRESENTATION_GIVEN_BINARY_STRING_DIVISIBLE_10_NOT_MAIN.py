if __name__ == '__main__':
    param = [
    ('101000',),
    ('39613456759141',),
    ('11',),
    ('PoiHjo',),
    ('2',),
    ('0000101',),
    ('T  s dZKeDX gK',),
    ('3944713969',),
    ('1000',),
    ('ifYUgdpmt',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
