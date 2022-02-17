====================
def print_words_string_reverse_order ( str ) :
    i = len ( str ) - 1
    start , end = i + 1 , i + 1
    result = ""
    while i >= 0 :
        if str [ i ] == ' ' :
            start = i + 1
            while start != end :
                result += str [ start ]
            result += ' '
            end = i
        i -= 1
    start = 0
    while start != end :
        result += str [ start ]
    return result

