import sys

def f_gold ( str , corner ) :
    n = len ( str )
    cl = len ( corner )
    if n < cl :
        return False
    return ( str [ : cl ] == corner and str [ n - cl : n ] == corner )

if __name__ == '__main__':
    param = [
    ('geeksmanishgeeks','geeks',),
    ('shreyadhatwalia','abc',),
    ('10000100','100',),
    ('abaa','a',),
    ('30645530','30',),
    ('0000011011001','001',),
    ('dkqEd','d',),
    ('48694119324654','654',),
    ('1101010010','11',),
    ('Ks','KsFLmngGGOmHKs',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_FIND_STRING_START_END_GEEKS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_FIND_STRING_START_END_GEEKS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
