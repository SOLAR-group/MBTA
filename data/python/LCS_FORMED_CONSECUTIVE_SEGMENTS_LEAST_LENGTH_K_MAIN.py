if __name__ == '__main__':
    param = [
    (4,'aggayxysdfa','aggajxaaasdfa',),
    (2,'55571659965107','390286654154',),
    (3,'01011011100','0000110001000',),
    (5,'aggasdfa','aggajasdfaxy',),
    (2,'5710246551','79032504084062',),
    (3,'0100010','10100000',),
    (3,'aabcaaaa','baaabcd',),
    (1,'1219','3337119582',),
    (2,'111000011','011',),
    (2,'wiC oD','csiuGOUwE',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K," + sys.argv[1] + "," + str(i) + ",EXCEPTION")