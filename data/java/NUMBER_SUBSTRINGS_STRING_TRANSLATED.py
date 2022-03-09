import sys

def f_gold ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , 'deut' )
    except getopt.error as msg :
        print ( msg )
        return
    for o , a in opts :
        if o == '-d' :
            d = a.lower ( )
        if o == '-e' :
            e = a.upper ( )
        if o == '-u' :
            u = a.lower ( )
        if o == '-b' :
            b = a.upper ( )
        if o == '-c' :
            c = a.lower ( )
        if o == '-f' :
            f = a.upper ( )
        if o == '-h' :
            help = a.lower ( )
        if o == '--help' :
            print ( __doc__ )
        elif o == '--version' :
            print ( __version__ )
        elif o == '--python-version' :
            print ( _PYTHON_VERSION )
        elif o == ' - -
if __name__ == '__main__':
    param = [
    ('gZFGZsHCimLf',),
    ('505357',),
    ('011011101',),
    ('ovfwP Osauz',),
    ('92132238746026',),
    ('01100',),
    ('RaOWYQRfiWKSyC',),
    ('861330202',),
    ('001100010',),
    ('uvpKlGUBLOMba',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_SUBSTRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
