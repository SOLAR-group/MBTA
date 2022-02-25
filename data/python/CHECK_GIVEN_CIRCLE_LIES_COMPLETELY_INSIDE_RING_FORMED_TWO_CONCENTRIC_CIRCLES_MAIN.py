if __name__ == '__main__':
    param = [
    (8,4,2,6,0,),
    (400,1,10,74,38,),
    (1,400,10,74,38,),
    (61,40,2,50,0,),
    (60,49,68,77,71,),
    (88,10,69,71,26,),
    (60,79,92,29,38,),
    (26,88,75,84,10,),
    (33,65,57,21,61,),
    (70,57,77,52,87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_GIVEN_CIRCLE_LIES_COMPLETELY_INSIDE_RING_FORMED_TWO_CONCENTRIC_CIRCLES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
