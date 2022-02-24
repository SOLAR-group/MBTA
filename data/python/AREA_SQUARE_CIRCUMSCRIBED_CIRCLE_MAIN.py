if __name__ == '__main__':
    param = [
    (14,),
    (78,),
    (45,),
    (66,),
    (18,),
    (32,),
    (60,),
    (16,),
    (99,),
    (65,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("AREA_SQUARE_CIRCUMSCRIBED_CIRCLE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("AREA_SQUARE_CIRCUMSCRIBED_CIRCLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
