if __name__ == '__main__':
    param = [
    (['LISTEN'],['SILENT'],),
    (['TRIANGLE'],['INTEGRAL'],),
    (['test'],['ttew'],),
    (['night'],['thing'],),
    (['Inch'],['Study'],),
    (['Dusty'],['1'],),
    (['GJLMOOSTTXaabceefgllpwz'],['EJRXYajoy'],),
    (['41658699122772743330'],['9931020'],),
    (['0000000000000000000000001111111111111111111'],['0000000000000000000001111111111111111111111'],),
    (['ERioPYDqgTSz bVCW'],['GLajZE'],)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
