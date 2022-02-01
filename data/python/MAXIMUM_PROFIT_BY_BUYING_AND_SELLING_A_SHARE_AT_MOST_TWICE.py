# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(price, n):
    profit = [0] * n
    max_price = price[n - 1]
    for i in range(n - 2, 0, - 1):
        if price[i] > max_price:
            max_price = price[i]
        profit[i] = max(profit[i + 1], max_price - price[i])
    min_price = price[0]
    for i in range(1, n):
        if price[i] < min_price:
            min_price = price[i]
        profit[i] = max(profit[i - 1], profit[i] + (price[i] - min_price))
    result = profit[n - 1]
    return result


#TOFILL
