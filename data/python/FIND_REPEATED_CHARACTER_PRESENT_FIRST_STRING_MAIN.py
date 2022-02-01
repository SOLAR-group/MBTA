if __name__ == '__main__':
    param = [
    ('ORXMflacQFBv',),
    ('39977638567848',),
    ('011110011011',),
    ('fYjfNy',),
    ('222280492',),
    ('11',),
    ('UjntBg',),
    ('6866190138212',),
    ('0000',),
    ('FWz PWEQgVlRZ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
