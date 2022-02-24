if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (6,),
    (10,),
    (55,),
    (48,),
    (63,),
    (72,),
    (16,),
    (85,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
