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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_STEPS_TO_DELETE_A_STRING_AFTER_REPEATED_DELETION_OF_PALINDROME_SUBSTRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
