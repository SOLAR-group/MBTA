if __name__ == '__main__':
    param = [
        ('7',),
        ('305745689',),
        ('444',),
        ('4',),
        ('2074',),
        ('27',),
        ('447',),
        ('255',),
        ('10000111111011',),
        ('fAKcSDRTNz',)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
