if __name__ == '__main__':
    param = [
    ('HCoAefoaan',),
    ('80336005',),
    ('01111111110',),
    ('qIH',),
    ('4210598472796',),
    ('10101',),
    ('imqmKdatcgXjs',),
    ('950509666021',),
    ('10111101101',),
    ('wasqgYFvz',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")