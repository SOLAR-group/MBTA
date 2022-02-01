if __name__ == '__main__':
    param = [
    ('gZFGZsHCimLf',),
    ('505357',),
    ('011011101',),
    ('ovfwP Osauz',),
    ('92132238746026',),
    ('01100',),
    ('RaOWYQRfiWKSyC',),
    ('861330202',),
    ('001100010',),
    ('uvpKlGUBLOMba',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
