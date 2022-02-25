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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
