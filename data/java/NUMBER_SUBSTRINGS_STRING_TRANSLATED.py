====================
def py2exe_options ( ) :
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
