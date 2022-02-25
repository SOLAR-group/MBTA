if __name__ == '__main__':
    param = [
    ('vdevdNdQSopPtj',),
    ('5',),
    ('100010101011',),
    ('tlDOvJHAyMllu',),
    ('06',),
    ('101',),
    ('DYgtU',),
    ('4',),
    ('00',),
    ('Dt',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
