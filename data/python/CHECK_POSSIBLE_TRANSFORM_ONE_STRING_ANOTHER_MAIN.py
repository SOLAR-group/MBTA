if __name__ == '__main__':
    param = [
    ('daBcd','ABC',),
    ('417514','9',),
    ('010000','1111011010',),
    ('ZcKYguiMrdyn','iz',),
    ('argaju','RAJ',),
    ('1110101101','110101001',),
    ('ySOCoSaygi','aRhxkYqh',),
    ('204','6986871066',),
    ('10011100000010','0',),
    ('nMAioozPmY','WZFdDKw',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")