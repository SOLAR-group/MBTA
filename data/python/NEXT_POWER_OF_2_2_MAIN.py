if __name__ == '__main__':
    param = [
    (63,),
    (78,),
    (13,),
    (5,),
    (34,),
    (69,),
    (63,),
    (78,),
    (80,),
    (19,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NEXT_POWER_OF_2_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
