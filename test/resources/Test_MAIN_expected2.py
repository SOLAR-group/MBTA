if __name__ == '__main__':
    TEST_MAIN_0
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            TEST_FOR_0
            f_gold(*parameters_set)
            TEST_FOR_1
            print("Test2," + sys.argv[1] + "," + str(i) + "," + ','.join(str(e) for e in parameters_set).replace(',', ';'))
        except:
            print("Test2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
