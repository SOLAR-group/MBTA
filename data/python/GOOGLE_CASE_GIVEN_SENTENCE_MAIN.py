if __name__ == '__main__':
    param = [
        ('TEYndweqZA',),
        ('01865',),
        ('11001100',),
        ('CzwznJmQet',),
        ('318305446',),
        ('0000001111110',),
        ('yzT',),
        ('38630230',),
        ('01101',),
        ('zoizI',)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))