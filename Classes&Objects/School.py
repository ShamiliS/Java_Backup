'''
Created on 10 Apr 2018

@author: SHSRINIV
'''
from builtins import range


class School:
    
    schoolname = "PSG"
    
    def __init__(self, stud_id, stud_name, staff_id, staff_name):
        self.stud_id = stud_id
        self.stud_name = stud_name
        self.staff_id = staff_id
        self.staff_name = staff_name
        
    def displayStudinfo(self):
        return self.stud_id + "," + self.stud_name + "," + School.schoolname
        
    def displayStaffinfo(self):
        list = []
        list.append(self.staff_id)
        list.append(self.staff_name)
        list.append(School.schoolname)
        return list

        
sch1 = School("001", "Sham", "S_001", "Maths")
# School.staffDetails("s_001", "Prabu")
str = sch1.displayStudinfo()
str.split(",")
print(str)
list = sch1.displayStaffinfo()
print(len(list))
for i in range(len(list)):
    print(list[i])
    
