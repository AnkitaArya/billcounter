## BillCounter APP

### Author - Ankita Arya

#### Description:
This application is developed to serve as a billing counter for a online retail shop.

#### Tech Stack:
Java, Spring Boot, Rest APIs, H2Db(in memory), Maven, JPA

#### Pre-Requisites:
Before executing billcounter App , you may require :
Java
SpringBoot
Maven
any IDEs, etc.

#### Steps To Setup:
1. Import the files into an IDE.
2. Once done, right click the root folder of the project and select maven build. This will download all the necessary libraries, the project requires.
3. Once downloaded, now you can again right click the 'BillcounterApplication' Java file and select Run As JavaApplication , under Run as option.
4. Once execute successfully, api will be available at  http://localhost:8600/api/v1/bill.
5. Utilise the APIs to fetch detailed bill by sending product Id's as input.

#### Features:
BillCounter application consists of following API as different features mentioned below :
1.  A user can fetch the itemized bill with all the products checked out in the online retail website.


#### Future Scope:
Due to limited requirement along with time constraint, this application caters only a single operation to fetch the final bill.
But the scope of this application is much broader and needs to be expanded further by implementing below features as future plan :
1.  Further more operations like add a product, update a product, delete a product, etc can be developed.
2. Security aspects needs to be added by allowing rescticted access or scope based access only using JWT tokens. 
3. As per now, basic required test cases have been implemented, which can be extended to cover entire code base.


#### Bill Properties :
An bill comprises of below mentioned properties :
1. List of Product details
2. total amount without tax
3. total sales tax
4. total amount payable

#### Product Properties :
An product comprises of below mentioned properties :
1. ProductId
2. Product Name
3. Description
4. Price
5. Tax Category
6. Tax amount

####Tax Categories
1. Category A - 10%
2. Category B - 20%
3. Category C- No tax

#### Validations:
1. A product is considered as duplicate if it has same values for productId and Name.
   Thus, two products can not have same productId and Name.

#### License:
This is an open source project and you are free to copy, modify, and distribute the project.