if __name__ == '__main__':
    param = [
    ("amazon","azonam",),
    ("onamaz","amazon",),
    ("amazon","azoman",),
    ("ab","ab",),
    ('737009','239119',),
    ('000110','01111',),
    ('l','YVo hqvnGxow',),
    ('4420318628','52856',),
    ('11011111000000','10',),
    (' pvFHANc','xBIDFbiGb',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
