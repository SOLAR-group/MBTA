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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_OF_SUBSTRINGS_WITH_ODD_DECIMAL_VALUE_IN_A_BINARY_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
