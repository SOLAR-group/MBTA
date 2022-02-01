if __name__ == '__main__':
    param = [
    ('geeekk',),
    ('3786868',),
    ('110',),
    ('aaaabbcbbb',),
    ('11',),
    ('011101',),
    ('WoHNyJYLC',),
    ('3141711779',),
    ('10111101101',),
    ('aabbabababcc',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
