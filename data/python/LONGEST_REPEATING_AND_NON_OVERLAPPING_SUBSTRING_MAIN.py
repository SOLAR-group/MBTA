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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
