def simi_aaa(a1, a2):              
    a1 = [float(i) for i in a1] 
    a2 = [float(i) for i in a2] 
    a1.sort() 
    a2.sort() 
      
    # Check for AAA 
    if a1[0] == a2[0] and a1[1] == a2[1] and a1[2] == a2[2]: 
        return 1
    return 0
  
# Function for SAS similarity 
def simi_sas(s1, s2, a1, a2):  
      
    s1 = [float(i) for i in s1] 
    s2 = [float(i) for i in s2] 
    a1 = [float(i) for i in a1] 
    a2 = [float(i) for i in a2] 
      
    s1.sort() 
    s2.sort() 
    a1.sort() 
    a2.sort() 
      
    # Check for SAS 
      
    # angle b / w two smallest sides is largest. 
    if s1[0] / s2[0] == s1[1] / s2[1]: 
          
        # since we take angle b / w the sides. 
        if a1[2] == a2[2]:          
            return 1
              
    if s1[1] / s2[1] == s1[2] / s2[2]: 
        if a1[0] == a2[0]: 
            return 1
              
    if s1[2] / s2[2] == s1[0] / s2[0]: 
        if a1[1] == a2[1]: 
            return 1
      
    return 0
  
# Function for SSS similarity 
def simi_sss(s1, s2):  
      
    s1 = [float(i) for i in s1] 
    s2 = [float(i) for i in s2]  
    s1.sort() 
    s2.sort()  
      
    # Check for SSS 
    if(s1[0] / s2[0] == s1[1] / s2[1]  
        and s1[1] / s2[1] == s1[2] / s2[2]  
        and s1[2] / s2[2] == s1[0] / s2[0]): 
        return 1
      
    return 0
      
  
# Driver Code
s1=[]
s2=[]
for x in range(3):
    numbers=int(input())
    s1.append(numbers)
for x in range(3):
    numbers=int(input())
    s2.append(numbers)
a1=[]
a2=[]
for x in range(3):
    a1.append(int(input()))
for x in range(3):
    a2.append(int(input()))
          
# function call for AAA similarity 
aaa = simi_aaa(a1, a2)  
  
# function call for SSS similarity  
sss = simi_sss(s1, s2)  
  
# function call for SAS similarity  
sas = simi_sas(s1, s2, a1, a2)  
  
# Check if triangles are similar or not  
if aaa or sss or sas:  
    print ("Triangles are similar by")
    if aaa: print ("AAA")  
    if sss: print ("SSS") 
    if sas: print ("SAS")
else: print ("Triangles are not similar")
             