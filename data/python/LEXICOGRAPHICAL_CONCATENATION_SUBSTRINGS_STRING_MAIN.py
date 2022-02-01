if __name__ == '__main__':
    param = [
    ('sqGOi',),
    ('848580',),
    ('01001110011001',),
    ('ZhWXUKmeiI',),
    ('0917296541285',),
    ('01101001111100',),
    ('tjP kR',),
    ('999907',),
    ('011100',),
    ('qJPHNSJOUj',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
