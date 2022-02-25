if __name__ == '__main__':
    param = [
    (59,-99,),
    (-20,-21,),
    (-100,79,),
    (54,-49,),
    (-16,16,),
    (-23,-68,),
    (93,37,),
    (24,-61,),
    (-8,69,),
    (29,10,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DETECT_IF_TWO_INTEGERS_HAVE_OPPOSITE_SIGNS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DETECT_IF_TWO_INTEGERS_HAVE_OPPOSITE_SIGNS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
