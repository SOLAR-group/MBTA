if __name__ == '__main__':
    param = [
    (1,),
    (92,),
    (29,),
    (52,),
    (55,),
    (13,),
    (83,),
    (83,),
    (10,),
    (67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
