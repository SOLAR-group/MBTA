import sys

def f_gold ( price , n ) :
    profit = [ ]
    for i in range ( n ) :
        profit.append ( 0 )
    max_price = price [ n - 1 ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        if price [ i ] > max_price :
            max_price = price [ i ]
        profit.append ( max ( profit [ i + 1 ] , max_price - price [ i ] ) )
    min_price = price [ 0 ]
    for i in range ( 1 , n ) :
        if price [ i ] < min_price :
            min_price = price [ i ]
        profit.append ( max ( profit [ i - 1 ] , profit [ i ] + ( price [ i ] - min_price ) ) )
    result = profit [ - 1 ]
    return result

if __name__ == '__main__':
    param = [
        ([9, 10, 10, 12, 17, 18, 23, 32, 41, 44, 47, 50,
          59, 69, 69, 75, 82, 84, 87, 89, 97, 99], 20,),
        ([6, 6, 60, 40, 32, -70, -92, 88, 10, -8, -54, 4, 16, 8, -44, 80, -70, 36, 36, -
          74, -94, 18, -64, -66, -46, 0, -54, -84, 16, -88, -34, -24, 92, 84, 62], 34,),
        ([0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 13,),
        ([2, 67, 50, 8, 20, 42, 37, 69, 86, 74, 85, 96, 78, 89, 91], 8,),
        ([-68, -52, -14, -2, 18, 22, 30, 34, 64, 64, 70], 9,),
        ([1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0,
          1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1], 21,),
        ([4, 17, 19, 28, 29, 30, 30, 30, 35, 36, 36, 38, 40, 40, 42, 43, 45, 51,
          55, 57, 58, 59, 64, 65, 66, 82, 84, 85, 87, 91, 92, 94, 98, 98], 25,),
        ([52, 88, -40, 60, 30, 8, -96, 66, -96, -28, -56, -14, 76, -92,
          56, 58, 64, -60, -90, 26, 64, -2, 54, -24, 54, -46, -44], 14,),
        ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
          0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 22,),
        ([82, 14, 51, 12, 5, 15, 50, 88, 91, 82, 16, 98, 23, 58, 86,
          91, 30, 81, 7, 73, 67, 47, 10, 50, 43, 31, 19, 2, 22], 18,)
    ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
