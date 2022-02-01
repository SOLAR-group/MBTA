if __name__ == '__main__':
    param = [
        ('ZNHGro', 'jAdbtDUYQu', 3,),
        ('382880806774', '65565', 10,),
        ('0', '00100010100', 2,),
        ('lxHTRFCTSQ', 'sViXYE', 89,),
        ('6399914758', '780990121', 9,),
        ('01100011100000', '0100', 0,),
        ('WkGqlob', 'NpQVdXzEtUZy', 6,),
        ('46974006151', '74438', 11,),
        ('1001001', '1000010', 15,),
        ('IJQ', 'nFOHAeYEAp', 42,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
