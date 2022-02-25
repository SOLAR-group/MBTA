if __name__ == '__main__':
    param = [
    (62,),
    (13,),
    (29,),
    (72,),
    (30,),
    (20,),
    (10,),
    (47,),
    (91,),
    (52,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COMPOSITE_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
