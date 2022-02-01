if __name__ == '__main__':
    param = [
    ('SgUmIrEAB',),
    ('304',),
    ('0010',),
    ('VGC BeErLvQ',),
    ('0872',),
    ('00110001',),
    ('Lsqwm',),
    ('308998',),
    ('1000011',),
    ('XCEOs',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
