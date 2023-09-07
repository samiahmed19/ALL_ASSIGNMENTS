s=input("Enter a string: ")
s=s.lower()
temp=set()
for i in s:
    temp.add(i)
st=""
for i in temp:
    st=st+i
    sorted(st)
print(st)
    