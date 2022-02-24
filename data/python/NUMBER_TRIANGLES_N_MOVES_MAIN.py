if __name__ == '__main__':
    param = [
    (33,),
    (72,),
    (81,),
    (93,),
    (8,),
    (76,),
    (97,),
    (91,),
    (61,),
    (6,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_TRIANGLES_N_MOVES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
