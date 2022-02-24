if __name__ == '__main__':
    param = [
    ('WKTj Nw',),
    ('8235021',),
    ('0101',),
    ('BLMhiQsQcFla',),
    ('00363175722',),
    ('10000',),
    ('aqEYWNd bqgye',),
    ('83',),
    ('000011110111',),
    ('E',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_GIVEN_STRING_CAN_SPLIT_FOUR_DISTINCT_STRINGS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_GIVEN_STRING_CAN_SPLIT_FOUR_DISTINCT_STRINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
