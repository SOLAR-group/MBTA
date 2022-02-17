====================
def count_characters_string_distance_ENGLISH_ALPHABETS ( str ) :
    result = 0
    n = len ( str )
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if abs ( str [ i ] - str [ j ] ) == abs ( i - j ) :
                result += 1
    return result

