'''
Created on 4 Apr 2018

@author: SHSRINIV
'''
import math

import SampleFunction
import var_len_arg

# module1
var_len_arg.printinfo(56, 20, 10)

# module2
prntval = SampleFunction.samplefun("Shamili")
for val in prntval:
    print(val)
    
content = dir(math)
print(content)


def sum(a, b):  
    "Adding the two values"  
    print("Printing within Function") 
    print(a + b)  
    return a + b


total = sum(10, 20)  
print("Printing Outside:", total)
