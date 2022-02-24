if __name__ == '__main__':
    param = [
    (20,31,[1, 6, 11, 14, 14, 15, 23, 24, 26, 28, 30, 35, 40, 45, 47, 50, 52, 54, 56, 57, 59, 60, 61, 66, 70, 77, 78, 80, 80, 87, 88, 97],),
    (20,29,[10, 6, -38, -32, -36, 24, 62, 66, 34, 24, 82, -46, 46, -48, -24, 28, 74, 40, -96, 60, 82, 12, -14, 52, 98, 28, 82, 62, 18, 42, -80],),
    (18,18,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (23,27,[32, 41, 8, 32, 66, 68, 56, 11, 71, 44, 62, 19, 27, 42, 82, 3, 79, 47, 82, 28, 7, 29, 79, 3, 33, 65, 55, 34, 41, 63, 29],),
    (28,34,[-96, -94, -90, -88, -84, -78, -76, -60, -60, -58, -42, -40, -36, -36, -28, -24, -8, 2, 4, 8, 10, 22, 26, 30, 32, 36, 36, 40, 48, 48, 52, 64, 68, 70, 74, 74, 78, 90, 92, 94],),
    (14,15,[1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0],),
    (20,18,[1, 5, 12, 18, 23, 30, 31, 34, 40, 45, 48, 51, 52, 53, 55, 58, 58, 59, 60, 63, 67, 69, 74, 78, 85, 97, 99, 99],),
    (46,28,[-18, 32, -54, -44, -24, -78, -98, -66, 34, 4, -12, 8, -76, -20, 72, 58, 76, 96, -70, -26, -98, 90, -40, 6, -30, -90, -8, -64, -22, 4, 82, 16, 18, 22, 30, 10, -14, 26, -48, 74, -38, -28, 62, 98, -32, 78, -22, -38, -70],),
    (39,46,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (13,19,[60, 96, 34, 69, 96, 9, 58, 59, 59, 68, 14, 53, 68, 89, 2, 5, 42, 31, 1, 33, 62, 1, 91, 85, 70, 68, 18],)
        ]
    filled_function_param = [
    (20,31,[1, 6, 11, 14, 14, 15, 23, 24, 26, 28, 30, 35, 40, 45, 47, 50, 52, 54, 56, 57, 59, 60, 61, 66, 70, 77, 78, 80, 80, 87, 88, 97],),
    (20,29,[10, 6, -38, -32, -36, 24, 62, 66, 34, 24, 82, -46, 46, -48, -24, 28, 74, 40, -96, 60, 82, 12, -14, 52, 98, 28, 82, 62, 18, 42, -80],),
    (18,18,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (23,27,[32, 41, 8, 32, 66, 68, 56, 11, 71, 44, 62, 19, 27, 42, 82, 3, 79, 47, 82, 28, 7, 29, 79, 3, 33, 65, 55, 34, 41, 63, 29],),
    (28,34,[-96, -94, -90, -88, -84, -78, -76, -60, -60, -58, -42, -40, -36, -36, -28, -24, -8, 2, 4, 8, 10, 22, 26, 30, 32, 36, 36, 40, 48, 48, 52, 64, 68, 70, 74, 74, 78, 90, 92, 94],),
    (14,15,[1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0],),
    (20,18,[1, 5, 12, 18, 23, 30, 31, 34, 40, 45, 48, 51, 52, 53, 55, 58, 58, 59, 60, 63, 67, 69, 74, 78, 85, 97, 99, 99],),
    (46,28,[-18, 32, -54, -44, -24, -78, -98, -66, 34, 4, -12, 8, -76, -20, 72, 58, 76, 96, -70, -26, -98, 90, -40, 6, -30, -90, -8, -64, -22, 4, 82, 16, 18, 22, 30, 10, -14, 26, -48, 74, -38, -28, 62, 98, -32, 78, -22, -38, -70],),
    (39,46,[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],),
    (13,19,[60, 96, 34, 69, 96, 9, 58, 59, 59, 68, 14, 53, 68, 89, 2, 5, 42, 31, 1, 33, 62, 1, 91, 85, 70, 68, 18],)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            f_gold(*parameters_set)
            print("GIVEN_1S_2S_3S_KS_PRINT_ZIG_ZAG_WAY," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("GIVEN_1S_2S_3S_KS_PRINT_ZIG_ZAG_WAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
