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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
