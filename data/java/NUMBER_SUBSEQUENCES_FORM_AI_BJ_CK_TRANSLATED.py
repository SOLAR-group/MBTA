import sys

def f_gold ( s ) :
    a_count = 0
    b_count = 0
    c_count = 0
    for c in s :
        if c == 'a' :
            a_count = ( 1 + 2 * a_count )
        elif c == 'b' :
            b_count = ( a_count + 2 * b_count )
        elif c == 'c' :
            c_count = ( b_count + 2 * c_count )
    return c_count

if __name__ == '__main__':
    param = [
    ('',),
    ('abbc',),
    ('abcabc',),
    ('agsdbkfdc ',),
    ('ababab',),
    ('aaaaaaa',),
    ('aabaaabcc',),
    ('19',),
    ('1001100',),
    ('DtAnuQbU',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
