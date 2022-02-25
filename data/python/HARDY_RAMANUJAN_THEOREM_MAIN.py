if __name__ == '__main__':
    param = [
    (99,),
    (33,),
    (50,),
    (17,),
    (18,),
    (69,),
    (23,),
    (18,),
    (94,),
    (16,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("HARDY_RAMANUJAN_THEOREM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("HARDY_RAMANUJAN_THEOREM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
