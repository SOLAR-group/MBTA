if __name__ == '__main__':
    param = [
    (30,),
    (25,),
    (69,),
    (39,),
    (14,),
    (60,),
    (89,),
    (27,),
    (29,),
    (29,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_POINTS_INTERSECTION_N_CIRCLES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_POINTS_INTERSECTION_N_CIRCLES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
