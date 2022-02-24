if __name__ == '__main__':
    param = [
    ('smnKL',),
    ('270083',),
    ('0',),
    ('kcZdsz',),
    ('483544224',),
    ('000011',),
    ('WysGCirMwKBzP',),
    ('3366',),
    ('110',),
    ('NlaMkpCjUgg',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
