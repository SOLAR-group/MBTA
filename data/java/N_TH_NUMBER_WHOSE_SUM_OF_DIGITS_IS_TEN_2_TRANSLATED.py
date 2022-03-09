import sys

def f_gold ( n ) :
    nth_element = 19 + ( n - 1 ) * 9
    outliers_count = int ( math.log10 ( nth_element ) - 1 )
    nth_element += 9 * outliers_count
    return nth_element

if __name__ == '__main__':
    param = [
    (68,),
    (70,),
    (69,),
    (93,),
    (99,),
    (44,),
    (91,),
    (8,),
    (83,),
    (51,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
