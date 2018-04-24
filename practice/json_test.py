'''
Created on 4 Apr 2018

@author: SHSRINIV
'''
from sys import argv
import sys

import requests

url = "https://jsonplaceholder.typicode.com/posts/1"
json_output = {}
headers = {'content-Type':'application/json'}

response = requests.get(url)
keyval = response.text.split('\n')

print(sys.argv[0])

if len(sys.argv) > 1:
       key = argv[1]
       value = response.__ge__(key)
       json_output[str(key)] = str(value)
else:
           for i in keyval:
               value = response.__ge__(i)
               json_output[str(i)] = str(value)

print(json_output)
