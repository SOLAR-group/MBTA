if __name__ == '__main__':
    param = [
    ('lSUhEvxcgfI',),
    ('77329283',),
    ('010111111',),
    ('Stazb',),
    ('0702',),
    ('01111111',),
    ('a',),
    ('359118754930',),
    ('11011010010',),
    ('rznb',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NTH_EVEN_LENGTH_PALINDROME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NTH_EVEN_LENGTH_PALINDROME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
