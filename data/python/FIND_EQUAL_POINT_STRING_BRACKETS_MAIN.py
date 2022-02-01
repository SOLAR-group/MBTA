if __name__ == '__main__':
    param = [
    ("(())))(",),
    ("))",),
    ("((",),
    ("))(()(()()(",),
    (")((()(()",),
    ("))(()",),
    ("()))",),
    ("()",),
    ('1100110',),
    ('dhfSnebD',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_EQUAL_POINT_STRING_BRACKETS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_EQUAL_POINT_STRING_BRACKETS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_EQUAL_POINT_STRING_BRACKETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
