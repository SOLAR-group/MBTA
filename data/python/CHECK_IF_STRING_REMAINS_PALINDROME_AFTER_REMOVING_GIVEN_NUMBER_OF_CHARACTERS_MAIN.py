if __name__ == '__main__':
    param = [
    ('ZCoQhuM',2,),
    ('7437725',53,),
    ('11',30,),
    ('buGlvR',1,),
    ('9',92,),
    ('101101010110',3,),
    ('YguiM',18,),
    ('8198',90,),
    ('11101',71,),
    ('hUInqJXNdbfP',4,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_IF_STRING_REMAINS_PALINDROME_AFTER_REMOVING_GIVEN_NUMBER_OF_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")