if __name__ == '__main__':
    param = [
    ('ZCoQhuM',),
    ('2674377254',),
    ('11',),
    ('LbuGlvRyWAPBpo',),
    ('26382426486138',),
    ('111010111010',),
    ('hUInqJXNdbfP',),
    ('5191',),
    ('1110101101',),
    ('2202200',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
