====================
def find_the_first_missing_number ( array , start , end ) :
    if start > end :
        return end + 1
    if start != array [ start ] :
        return start
    mid = ( start + end ) // 2
    if array [ mid ] == mid :
        return f_gold ( array , mid + 1 , end )
    return f_gold ( array , start , mid )

