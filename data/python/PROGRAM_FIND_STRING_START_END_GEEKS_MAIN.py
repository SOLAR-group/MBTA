if __name__ == '__main__':
    param = [
    ('geeksmanishgeeks','geeks',),
    ('shreyadhatwalia','abc',),
    ('10000100','100',),
    ('abaa','a',),
    ('30645530','30',),
    ('0000011011001','001',),
    ('dkqEd','d',),
    ('48694119324654','654',),
    ('1101010010','11',),
    ('Ks','KsFLmngGGOmHKs',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_FIND_STRING_START_END_GEEKS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_FIND_STRING_START_END_GEEKS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_FIND_STRING_START_END_GEEKS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")