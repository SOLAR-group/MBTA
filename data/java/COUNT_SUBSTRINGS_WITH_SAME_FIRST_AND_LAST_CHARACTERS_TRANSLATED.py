====================
def count_substrings_with_same_first_and_last_characters ( s ) :
    result = 0
    n = len ( s )
    for i in range ( n ) :
        for j in range ( i , n ) :
            if s [ i ] == s [ j ] :
                result += 1
    return result

