if __name__ == '__main__':
    param = [
    (1657.0629620116251,1493.9165309072955,),
    (9124.969801011524,1805.1693004732417,),
    (939.4442550679516,4002.523220001232,),
    (1696.1076035017763,1305.681153243279,),
    (3624.090070396748,9193.838698730207,),
    (304.33897626625406,2077.168327165032,),
    (8242.270129715309,2452.3562706401203,),
    (4410.9174799683105,985.4222263517964,),
    (7951.742385610694,7364.610274987048,),
    (1280.6368084273633,9479.625581022658,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_HEIGHT_TRIANGLE_GIVEN_BASE_AREA," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_HEIGHT_TRIANGLE_GIVEN_BASE_AREA," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
