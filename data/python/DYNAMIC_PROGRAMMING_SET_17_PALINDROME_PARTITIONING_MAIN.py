if __name__ == '__main__':
    param = [
    ('ydYdV',),
    ('4446057',),
    ('0111',),
    ('keEj',),
    ('642861576557',),
    ('11111000101',),
    ('ram',),
    ('09773261',),
    ('1',),
    ('AVBEKClFdj',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")