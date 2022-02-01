if __name__ == '__main__':
    param = [
    ('aadaa',),
    ('2674377254',),
    ('11',),
    ('0011000 ',),
    ('26382426486138',),
    ('111010111010',),
    ('abccba',),
    ('5191',),
    ('1110101101',),
    ('abcdecbe',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
