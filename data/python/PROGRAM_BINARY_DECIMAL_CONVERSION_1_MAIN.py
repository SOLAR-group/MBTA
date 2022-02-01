if __name__ == '__main__':
    param = [
    ('uEmIAgF',),
    ('753310137',),
    ('010011010',),
    ('kNi',),
    ('04562016903312',),
    ('000111101',),
    ('bk',),
    ('9',),
    ('1',),
    ('XxT nXLlk',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
