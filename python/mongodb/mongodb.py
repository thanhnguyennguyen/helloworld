import pymongo

# start mongo with docker
# docker run -d -p "27017:27017" --name mongodb mongo

myclient = pymongo.MongoClient("mongodb://localhost:27017/")

mydb = myclient["hello_py"]
mycol = mydb["person"]

mydict = {"name": "NguyenNguyen", "address": "127.0.0.1"}

# insert
x = mycol.insert_one(mydict)

# update
myquery = {"name": "NguyenNguyen"}
newvalues = {"$set": {"address": "192.168.1.1"}}
mycol.update(myquery, newvalues)

# find
x = mycol.find(myquery)
print(x)

# delete
mycol.delete_many(myquery)

x = mycol.find(myquery)
print("After delete")
print(x)
