if __name__ == '__main__':
    param = [
    ('OaITtzE','RnYlJUqzk',),
    ('88111031','558471',),
    ('1100111','11111110111101',),
    ('eiWPbMrFx','tBAJaI',),
    ('43701248','4027',),
    ('100001111110','11',),
    ('jVgOapMp','Xm',),
    ('68337672','56939',),
    ('00110101','1',),
    ('JqSh','iAfjQRwuVyost',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")