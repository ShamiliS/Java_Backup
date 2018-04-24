'''
Created on 4 Apr 2018

@author: SHSRINIV
'''

dict = {"region":"HSBC", "application":"HSBC", "author":"prabu"}

for i in dict:
    if i == "application" and dict.get(i) == "HSBC":
     print (i , "contains" , dict.get(i))
