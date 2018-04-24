'''
Created on 9 Apr 2018

@author: SHSRINIV
'''
import sys, os

print(sys.argv[0])
print(os.path.dirname(sys.argv[0]))
path = os.path.dirname(sys.argv[0])
print(os.path.abspath(path))
print(os.getcwd())
str_file = "foo.txt"

if(os.path.isfile(str_file)):
    fo = open(path + "/" + str_file, "a+")
    position = fo.seek(0, 0);
    fo.write("hello world1" + "\n")
    print("Name of the file: ", fo.name)
    print("Closed or not : ", fo.closed)
    print("Opening mode : ", fo.mode)
  #  print("Softspace flag : ", fo.softspace)  -> Not working
  
    position = fo.tell();
    print("Position",position);
    print(fo.read(4))
    line = fo.fileno()
    print("line1",line)
    line = fo.readline(3)
    print("line2",line)
    fo.close;
