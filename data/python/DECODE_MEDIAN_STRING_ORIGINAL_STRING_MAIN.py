if __name__ == '__main__':
    param = [
    (' EgvQCeqYpZtv',),
    ('488540',),
    ('0000101010111',),
    ('syw',),
    ('402355',),
    ('0',),
    ('wmHMlAtq',),
    ('7962',),
    ('111111',),
    ('UbgRGDquop',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DECODE_MEDIAN_STRING_ORIGINAL_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
