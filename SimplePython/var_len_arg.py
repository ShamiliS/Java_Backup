'''
Created on 4 Apr 2018

@author: SHSRINIV
'''


def printinfo(arg1, *vartuple):
    
    print(arg1)
    for var in vartuple:
        print(var)
    return;


printinfo(80,60,70)