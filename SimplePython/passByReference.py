'''
Created on 4 Apr 2018

@author: SHSRINIV
'''

def passbyref(namevals):
    namelength = len(namevals)
    if(namelength > 0):
        for i in range(namelength):
            print(namevals[i])
            return namevals
    else:
        print("Names is Empty")
        
        
names = ['Sham', 'Prabu']
names.append("Test")
mylist  = passbyref(names)
print(mylist)
mylist.sort()
mylist.reverse()
print(mylist)
