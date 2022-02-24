if __name__ == '__main__':
    param = [
    ('g*ks','geeks',),
    ('ge?ks*','geeksforgeeks',),
    ('g*k','gee',),
    ('*pqrs','pqrst',),
    ('abc*bcd','abcdhghgbcd',),
    ('abc*c?d','abcd',),
    ('*c*d','abcd',),
    ('*?c*d','abcd',),
    ('?*1','010111111001',),
    ('a*','CBzHMjUGCUJD',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("WILDCARD_CHARACTER_MATCHING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("WILDCARD_CHARACTER_MATCHING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
