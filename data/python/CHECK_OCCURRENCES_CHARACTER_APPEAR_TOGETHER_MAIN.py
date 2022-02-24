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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
