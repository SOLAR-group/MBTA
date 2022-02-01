if __name__ == '__main__':
    param = [
    (' E',),
    ('0845591950',),
    ('00101011',),
    ('pLSvlwrACvFaoT',),
    ('7246',),
    ('1010101100000',),
    ('obPkcLSFp',),
    ('914757557818',),
    ('1',),
    ('PKvUWIQ',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LONGEST_PALINDROME_SUBSEQUENCE_SPACE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
