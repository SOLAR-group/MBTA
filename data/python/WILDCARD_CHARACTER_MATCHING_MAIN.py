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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WILDCARD_CHARACTER_MATCHING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WILDCARD_CHARACTER_MATCHING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WILDCARD_CHARACTER_MATCHING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
