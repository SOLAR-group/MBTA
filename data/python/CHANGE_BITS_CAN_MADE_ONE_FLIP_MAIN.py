if __name__ == '__main__':
    param = [
    ("00001",),
    ("0000",),
    ("11",),
    ("111110",),
    ("1",),
    ("111010111010",),
    ("hUInqJXNdbfP",),
    ("5191",),
    ("1110101101",),
    ('NupSrU xz',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHANGE_BITS_CAN_MADE_ONE_FLIP," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHANGE_BITS_CAN_MADE_ONE_FLIP," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
