import sys

def f_gold ( str ) :
    """
 Return the number of occurrences of a string in a string.
 """
    len = len ( str )
    one_seen = False
    count = 0
    for char in str :
        if char == '1' and one_seen == True :
            if str [ - 1 ] == '0' :
                count += 1
        if char == '1' and one_seen == False :
            one_seen = True
        if char != '0' and str [ - 1 ] != '1' :
            one_seen = False
    return count

if __name__ == '__main__':
    param = [
    ('1001ab010abc01001',),
    ('1001010001',),
    ('010100010100',),
    ('DLCu',),
    ('7072430592',),
    ('011',),
    ('pnJpypYOza',),
    ('1037',),
    ('111',),
    ('HxK',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
