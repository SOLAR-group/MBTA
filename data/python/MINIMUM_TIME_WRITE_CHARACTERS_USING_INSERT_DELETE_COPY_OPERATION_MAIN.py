if __name__ == '__main__':
    param = [
    (59,75,12,45,),
    (66,68,32,41,),
    (98,55,69,5,),
    (63,4,41,12,),
    (99,37,98,55,),
    (45,28,59,7,),
    (60,53,40,52,),
    (11,96,50,50,),
    (96,95,48,84,),
    (54,6,50,82,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_TIME_WRITE_CHARACTERS_USING_INSERT_DELETE_COPY_OPERATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")