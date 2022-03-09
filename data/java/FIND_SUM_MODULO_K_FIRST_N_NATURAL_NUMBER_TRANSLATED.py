import sys

def f_gold ( N , K ) :
    """
 Return the number of gold symbols in the given number of symbols.
 """
    ans = 0
    for i in range ( 1 , N + 1 ) :
        ans += ( i % K )
    return ans

if __name__ == '__main__':
    param = [
    (11,5,),
    (36,69,),
    (71,28,),
    (74,1,),
    (66,84,),
    (38,14,),
    (2,11,),
    (73,87,),
    (79,11,),
    (30,55,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
