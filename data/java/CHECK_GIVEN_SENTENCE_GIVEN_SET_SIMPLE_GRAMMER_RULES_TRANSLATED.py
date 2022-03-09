import sys

def f_gold ( str ) :
    """
 Return True if the given string is a gold string.
 """
    len ( str )
    if str [ 0 ] < 'A' or str [ 0 ] > 'Z' :
        return False
    if str [ - 1 ] != '.' :
        return False
    prev_state , curr_state = 0 , 0
    index = 1
    while index <= len ( str ) :
        if str [ index ] >= 'A' and str [ index ] <= 'Z' :
            curr_state = 0
        elif str [ index ] == ' ' :
            curr_state = 1
        elif str [ index ] >= 'a' and str [ index ] <= 'z' :
            curr_state = 2
        elif str [ index ] == '.' :
            curr_state = 3
        if prev_state == curr_state and curr_state != 2 :
            return False
        if prev_state == 2 and curr_state == 0 :
            return False
        if curr_state == 3 and prev_state != 1 :
            return ( index + 1 , str [ index ] )
        index += 1
        prev_state , curr_state = curr_state , curr_state
    return False

if __name__ == '__main__':
    param = ["I love cinema.", "The vertex is S.",
            "I am single.", "My name is KG.",
            "I lovE cinema.", "GeeksQuiz. is a quiz site.",
            "I love Geeksquiz and Geeksforgeeks.",
            "  You are my friend.", "I love cinema", "Hello world !"]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + sys.argv[1] + "," + str(i) + "," + str(f_gold(parameters_set)))
        except:
            print("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
