if __name__ == '__main__':
    param = [
    ('JlIgDXBFbCeFRB',88,),
    ('41122661',91,),
    ('011',31,),
    ('hOCcIOAJztdT',83,),
    ('155799263',74,),
    ('1111',35,),
    ('Egy',30,),
    ('6900599415',56,),
    ('101010011111',69,),
    ('IbmRqJcU',21,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("MINIMUM_SUM_SQUARES_CHARACTERS_COUNTS_GIVEN_STRING_REMOVING_K_CHARACTERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MINIMUM_SUM_SQUARES_CHARACTERS_COUNTS_GIVEN_STRING_REMOVING_K_CHARACTERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
