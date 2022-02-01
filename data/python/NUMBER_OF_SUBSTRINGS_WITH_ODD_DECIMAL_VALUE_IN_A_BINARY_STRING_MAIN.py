if __name__ == '__main__':
    param = [
    ('OGiOkJF',),
    ('517376',),
    ('11',),
    ('Ze',),
    ('8763644247018',),
    ('00111010001',),
    ('HGwkBKUOVu',),
    ('652',),
    ('101000011110',),
    ('kvdpG ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
