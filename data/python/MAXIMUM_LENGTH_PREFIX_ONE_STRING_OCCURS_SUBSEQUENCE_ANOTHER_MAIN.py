if __name__ == '__main__':
    param = [
    ('nObYIOjEQZ','uARTDTQbmGI',),
    ('84574','8538229',),
    ('1010001010010','11',),
    ('DjZtAfUudk','OewGm',),
    ('550','132744553919',),
    ('1110','0101',),
    ('GywyxwH','LPQqEqrDZiwY',),
    ('67318370914755','9928',),
    ('11011000000101','00000',),
    ('G','V',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
