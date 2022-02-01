if __name__ == '__main__':
    param = [
    (1772.6589509256596,),
    (-599.737107809315,),
    (1074.1765931782,),
    (-1182.4087746714795,),
    (8083.035797247716,),
    (-6126.414356565494,),
    (5370.057504189614,),
    (-6947.020794285176,),
    (2110.5107873533325,),
    (-6458.751326919488,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("AREA_OF_A_HEXAGON," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("AREA_OF_A_HEXAGON," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("AREA_OF_A_HEXAGON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
