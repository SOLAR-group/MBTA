if __name__ == '__main__':
    param = [
    ('gILrzLimS','m',),
    ('307471222','2',),
    ('110','0',),
    ('GcAB','v',),
    ('113','3',),
    ('011110010','0',),
    ('wcwob','w',),
    ('74571582216153','1',),
    ('100000011','0',),
    ('ryPErkzY','q',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
