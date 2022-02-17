====================
def PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE ( text , word ) :
    word_list = text.split ( )
    result = ""
    stars = ""
    for i in word :
        stars += '*'
    index = 0
    for i in word_list :
        if i == word :
            word_list [ index ] = stars
        index += 1
    for i in word_list :
        result += i + ' '
    return result

