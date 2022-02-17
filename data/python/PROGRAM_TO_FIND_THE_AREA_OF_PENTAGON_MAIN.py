if __name__ == '__main__':
    param = [
    (2009.019461888707,),
    (-1480.5131394215787,),
    (357.7870347569567,),
    (-8040.293697508038,),
    (3821.882657293133,),
    (-6840.635072240347,),
    (1623.036598830132,),
    (-9714.00706195298,),
    (3916.454769669618,),
    (-669.068424712943,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if abs(1 - (0.0000001 + abs(f_gold(*parameters_set))) / (abs(f_filled(*parameters_set)) + 0.0000001)) < 0.001:
                print("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_TO_FIND_THE_AREA_OF_PENTAGON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")