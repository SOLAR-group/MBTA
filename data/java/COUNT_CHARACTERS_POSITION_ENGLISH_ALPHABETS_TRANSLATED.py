====================
def count_characters_position_ENGLISH_ALPHABETS ( str ) :
    result = 0
    for char in str :
        if char in ( 'a' , 'A' ) :
            result += 1
    return result

