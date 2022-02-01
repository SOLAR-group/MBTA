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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_ROTATIONS_REQUIRED_GET_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
