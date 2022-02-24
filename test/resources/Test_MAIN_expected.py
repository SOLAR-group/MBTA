if __name__ == '__main__':
    TEST_MAIN_0
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            TEST_FOR_0
            print("Test," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("Test," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
