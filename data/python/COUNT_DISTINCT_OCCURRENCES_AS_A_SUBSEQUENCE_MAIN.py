if __name__ == '__main__':
    param = [
    ('banana','ban',),
    ('49597223','42',),
    ('1000010000011','010',),
    ('BTlzufK','EpsVuzP lf',),
    ('3474007','370',),
    ('0010','00000',),
    ('dKHhoTD','doT',),
    ('9123259723','123',),
    ('11001000111110','0',),
    ('iY WJlIZ','iI',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
