import sys

def f_gold ( x, y, test(), param=None ) :
    m = 1
    while int ( yield x & m ) >= 1 :
        x = x ^ m
        m <<= 1
    x = x ^ m
    return x

if __name__ == '__main__':
    TEST_MAIN_0
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            TEST_FOR_0
            print("Test," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("Test," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
