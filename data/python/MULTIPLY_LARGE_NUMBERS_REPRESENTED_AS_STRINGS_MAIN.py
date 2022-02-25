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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MULTIPLY_LARGE_NUMBERS_REPRESENTED_AS_STRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
