if __name__ == '__main__':
    param = [
    ('fbfHTjE',),
    ('09285256323',),
    ('0011000101110',),
    ('ue JkVZTt',),
    ('48387612426300',),
    ('010',),
    ('ddRrUz',),
    ('1049162633793',),
    ('100011',),
    ('iJfadiVaQqv',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
