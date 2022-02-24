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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
