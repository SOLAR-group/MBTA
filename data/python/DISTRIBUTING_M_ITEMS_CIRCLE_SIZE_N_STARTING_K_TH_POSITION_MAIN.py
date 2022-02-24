if __name__ == '__main__':
    param = [
    (19,14,34,),
    (23,51,5,),
    (92,10,24,),
    (9,50,34,),
    (20,67,20,),
    (68,25,40,),
    (66,30,24,),
    (77,22,32,),
    (90,1,71,),
    (26,34,54,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DISTRIBUTING_M_ITEMS_CIRCLE_SIZE_N_STARTING_K_TH_POSITION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
