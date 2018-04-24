'''
Created on 4 Apr 2018

@author: SHSRINIV
'''

diction = {"name":"sham", "Age":21, "blood":"B+"}
print (len(diction))

for i in diction:
    print("key", i, " contains ", diction.get(i), " value")
