FOR PRODUCT MANAGEMENT

Create Product :

http://localhost:8080/product/create
- Post Request

{
  "status": "ACTIVE",
  "created": "2022-11-25",
  "detail": {
    "productName": "AirPod Pro",
    "productDesc": "Apple AirPod Pro 2",
    "updatedOn": "2022-11-25"
  }
}

Get All Products:
http://localhost:8080/product/get
- Get Request

Get Product By Id
http://localhost:8080/product/get/1
http://localhost:8080/product/get/{id}
- Get Request

Update Product :
http://localhost:8080/product/update
- Put Request

{
    "id": 3,
    "status": "ACTIVE",
    "created": "2022-11-25",
    "detail": {
        "id": 3,
        "productName": "iPhone 14",
        "productCode": "AI1400001",
        "productDesc": "Apple iPhone 14 RED",
        "updatedOn": "2022-11-25"
    }
}


Product details creations/deletion is not allowed individually as it coupled with product as one to one relationship

Get All product details
http://localhost:8080/detail/get
- Get Request


Get specific product detail by id
http://localhost:8080/detail/get/1
http://localhost:8080/detail/get/{id}
- Get Request

Update Product detail
http://localhost:8080/detail
- Put Request

{
    "id": 1,
    "productName": "MacBook",
    "productCode": "AM000017",
    "productDesc": "Mac Book M2",
    "updatedOn": "2022-11-25"
}



FOR MERCHANT SERVICE
Test cases have written to test the application


