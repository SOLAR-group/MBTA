if __name__ == '__main__':
    param = [
    ('aadaa',),
    ('2674377254',),
    ('11',),
    ('0011000',),
    ('26382426486138',),
    ('111010111010',),
    ('abccba',),
    ('5191',),
    ('1110101101',),
    ('abcdecbe',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_GIVEN_STRING_ROTATION_PALINDROME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_GIVEN_STRING_ROTATION_PALINDROME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
