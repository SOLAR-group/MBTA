if __name__ == '__main__':
    param = [
        ('YCtLQtHLwr',),
        ('47713514383248',),
        ('0100101001111',),
        ('XfdIYVn',),
        ('45499225407',),
        ('000100111001',),
        ('ZoUQhQwoap',),
        ('18579027952',),
        ('00000001111',),
        ('JD',)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
