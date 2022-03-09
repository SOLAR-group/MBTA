import sys

def f_gold ( N ) :
    if N == 1 :
        return 4
    count_b , count_s , prev_count_b , prev_count_s = 1 , 1 , 1 , 1
    for i in range ( 2 , N + 1 ) :
        prev_count_b , prev_count_s = count_b , prev_count_s , count_s
        count_s = prev_count_b + prev_count_s
        count_b = prev_count_s
    result = count_s + count_b
    return ( result * result )

if __name__ == '__main__':
    param = [
    (17,),
    (66,),
    (53,),
    (97,),
    (34,),
    (54,),
    (9,),
    (99,),
    (59,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
