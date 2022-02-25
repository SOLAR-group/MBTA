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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
