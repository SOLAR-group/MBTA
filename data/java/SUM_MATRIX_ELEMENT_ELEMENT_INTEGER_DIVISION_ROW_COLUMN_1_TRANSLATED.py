import sys

def f_gold ( n ) :
    ans , temp , num = 0 , 0 , 0
    for i in range ( 1 , n and temp < n ) :
        temp = i - 1
        num = 1
        while temp < n :
            if temp + i <= n :
                ans += ( i * num )
            else :
                ans += ( ( n - temp ) * num )
            temp += i
            num += 1
    return ans

if __name__ == '__main__':
    param = [
    (35,),
    (93,),
    (7,),
    (81,),
    (80,),
    (47,),
    (7,),
    (41,),
    (59,),
    (34,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_MATRIX_ELEMENT_ELEMENT_INTEGER_DIVISION_ROW_COLUMN_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
