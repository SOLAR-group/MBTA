if __name__ == '__main__':
    param = [
        ('VkfzrPG', 'rKZ',),
        ('0526110506447', '903',),
        ('011010010', '110100000',),
        ('sPAwZACc ', 'liYMsojPiinOV',),
        ('3', '611',),
        ('0101', '01110101011',),
        ('VTtNu', 'Wsmc',),
        ('2317170', '898421173423',),
        ('111111000010', '01100001110111',),
        ('Ktt', 'CTbbVX wGBkE',)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
