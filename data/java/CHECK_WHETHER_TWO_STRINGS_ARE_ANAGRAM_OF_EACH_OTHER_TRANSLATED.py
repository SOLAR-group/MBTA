import sys

def f_gold ( str1 , str2 ) :
    n1 = len ( str1 )
    n2 = len ( str2 )
    if n1 != n2 :
        return False
    str1 = str1 [ : n1 ] + str2 [ : n2 ]
    for i in range ( n1 ) :
        if str1 [ i ] != str2 [ i ] :
            return False
    return True

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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
