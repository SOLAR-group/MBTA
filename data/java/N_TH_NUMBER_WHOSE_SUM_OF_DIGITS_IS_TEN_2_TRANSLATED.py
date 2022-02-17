====================
def f_gold ( n ) :
    nth_element = 19 + ( n - 1 ) * 9
    outliers_count = int ( math.log10 ( nth_element ) - 1 )
    nth_element += 9 * outliers_count
    return nth_element

