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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
