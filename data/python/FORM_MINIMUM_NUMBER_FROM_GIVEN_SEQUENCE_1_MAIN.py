if __name__ == '__main__':
    param = [
    ('D',),
    ('I',),
    ('DD',),
    ('II',),
    ('DIDI',),
    ('IIDDD',),
    ('DDIDDIID',),
    ('176297',),
    ('1',),
    ('XHkhZq',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
