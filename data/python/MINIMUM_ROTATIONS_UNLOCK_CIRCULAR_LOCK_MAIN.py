if __name__ == '__main__':
    param = [
    (71,46,),
    (90,65,),
    (28,84,),
    (41,23,),
    (32,58,),
    (39,82,),
    (33,58,),
    (89,32,),
    (50,51,),
    (92,77,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
