'''
Created on 4 Apr 2018

@author: SHSRINIV
'''


def pass2arg(name, age=62):
    if (age < 18):
        print(name," is ",age," old called TEENAGERS")
    elif (age < 60):
        print(name," is ",age," old called ELDERS")
    else:
        print(name," is",age," old called SENIOR CITIZENSHIP")
    
    
pass2arg("Prabu", 30)
pass2arg("Sham")
    
