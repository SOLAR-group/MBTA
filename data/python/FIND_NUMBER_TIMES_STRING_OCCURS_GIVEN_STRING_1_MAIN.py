if __name__ == '__main__':
    param = [
    ('fZOKCdZ Lav','fKA',),
    ('2','187012',),
    ('1000001110','0',),
    ('IAOyBzgIWHo','oA',),
    ('211806','10',),
    ('1','001011100',),
    ('CVaQTG','CT',),
    ('6265187228','628',),
    ('10111101101000','01111',),
    ('vEi','bigsvkQG',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
