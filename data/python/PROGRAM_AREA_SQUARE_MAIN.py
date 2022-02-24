if __name__ == '__main__':
    param = [
    (50,),
    (64,),
    (92,),
    (23,),
    (38,),
    (55,),
    (67,),
    (56,),
    (60,),
    (90,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
