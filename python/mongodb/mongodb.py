import pymongo
# start mongo with docker
# docker run -d -p "27017:27017" --name mongodb mongo

myclient = pymongo.MongoClient("mongodb://localhost:27017/")

mydb = myclient["hello_py"]
mycol = mydb["person"]

mydict = {"name": "NguyenNguyen", "address": "127.0.0.1"}

x = mycol.insert_one(mydict)
