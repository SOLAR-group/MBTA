import sys

def f_gold ( n ) :
    """
 Return the sum of all the gold products of n in the given order.
 """
    sum = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 ) :
            sum = sum + i * j
    return sum

if __name__ == '__main__':
    param = [
    (21,),
    (32,),
    (16,),
    (38,),
    (9,),
    (3,),
    (5,),
    (46,),
    (45,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
