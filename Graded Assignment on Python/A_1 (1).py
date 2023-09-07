print("The books are: ")
print("Book 1- Introduction to Python Programming : Rs 499.00\nBook 2- Python Libraries Cookbook : Rs. 855.00\nBook 3- Data Science in Python : Rs. 645.00")
select=input("Do you want to select these are not  (Y/N or y/n):  ")
if select=='y' or select =='Y':
    print("Prices of the books Book-1 =499.00  Book-2 =855.00  Book-3 =645.00")
    a=input("These are the books,  Do you want to go for the qty of books (Y/N or y/n): ")
    if a=='y' or a=='Y': 
        c1=int(input("Select qty for book1: "))
        c1=c1*499.00
        c2=int(input("Select qty for book2: "))
        c2=c2*855.00
        c3=int(input("Select qty for book3: "))
        c3=c3*645.00
else:
    exit(0)
print("\t\t\t  GST added 12%")
print("\t\tdelivery charges 250.00")
d=250.00
t_cost=c1+c2+c3
gst=(float)(t_cost*12)/100
total=t_cost+gst
print("\n\n\n")
print("The Total Invoice Amount For The Below Purchases \n\n\n")
print("--------------THE BILL--------------")
print("items        qty")
print("BOOk-1       ",c1)
print("BOOk-2       ",c2)
print("BOOk-3       ",c3,"            total")
print("------------------------------------")
print("                              ",total)