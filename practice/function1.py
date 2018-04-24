'''
Created on 4 Apr 2018

@author: SHSRINIV
'''


# without argument
def calcuator_add(a, b):
    return(a + b)


# with arguement
def calculator_sub(a, b):
    c = a - b
    return c


result = calculator_sub(5, 2)


def calculator_mul(a, b):
    c = a * b
    return c


result = calculator_sub(5, 2)


def calculat_div(a, b=1):
    return(a + b)

def listCheck(listofvalues):
    listofvalues.sort()
    for i in listofvalues:
        print(i)
    