if __name__ == '__main__':
    param = [
    ('abcccdf','abccdf',),
    ('aabba','ab',),
    ('aabsdfljk','aa',),
    ('IONiqV','XKbBiGZ',),
    ('9667771256770','50915176',),
    ('10001011','01',),
    ('fczbDtMDT','FbX',),
    ('298746088','29888',),
    ('01100011000','0',),
    ('Qk','',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
