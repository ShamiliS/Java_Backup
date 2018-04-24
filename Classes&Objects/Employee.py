'''
Created on 9 Apr 2018

@author: SHSRINIV
'''


class Employee:
    empCount = 0;  # class variable whose value is shared among all instances of a this class

    def __init__(self, name, salary):  # class constructor is a special method. 
        #Called by Python when create new instance class     
        self.name = name
        self.salary = salary
        Employee.empCount = 1  # accessed inside the class or outside the class
        
    def displayEmployee(self): # python adds self argument to the list. No need to mention/include when calling method
        print(Employee.empCount)
        print(self.name)
        print(self.salary)


emp1 = Employee("Zara", 1000) # emp1 in the instance object for Employee class
#while calling __init__ method. We can use the Employee class name. passing by number of arguments in the init
emp1.displayEmployee()
emp1.__init__("Sham", 2000)
emp1.displayEmployee
#Employee is class name here
#Class variable accessed using classname
#emp1 is the object for Employee class
#instance method and instance variable are called using object name

