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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_EQUAL_POINT_STRING_BRACKETS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_EQUAL_POINT_STRING_BRACKETS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
