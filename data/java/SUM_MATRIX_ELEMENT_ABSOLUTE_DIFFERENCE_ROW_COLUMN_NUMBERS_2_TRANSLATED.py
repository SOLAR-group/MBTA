import sys

def f_gold ( n ) :
    n -= 1
    sum = 0
    sum += ( n * ( n + 1 ) ) / 2
    sum += ( n * ( n + 1 ) * ( 2 * n + 1 ) ) / 6
    return sum

if __name__ == '__main__':
    param = [
    (12,),
    (89,),
    (76,),
    (2,),
    (81,),
    (11,),
    (26,),
    (35,),
    (16,),
    (66,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
