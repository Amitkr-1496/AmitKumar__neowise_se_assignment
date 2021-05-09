# AmitKumar__neowise_se_assignment
Assignment from NeoWise
Created rest Api using Spring boot and JPA h2
theme--Transaction API
model--Customer-->one to many -->Transactions

Done part--: 
Transaction model-->
1. get mapping for geting transactions by txnid.
2. post mapping for creating new transaction.
3.put method for reversing a transaction.
4.get method retrive all to show all the transactions.
5. Basic exception handling

pending Part-->
1.Scope of Customer model with its join with transactions entity.
2.Controller for Customer with mapping models so transactions can be get using Customer Id's.
3.Creating an Custom Exception handling with @ControllerAdvice controller



//Use below Json Request for Post Request:
getall:http://localhost:9870/transactions
Post request:http://localhost:9870/transactions
{
    "amount": "10.252",
    "details": "Send from Paytm",
    "sender": 1
}
Put request for reverse: http://localhost:9870/transactions/2
Get by id: http://localhost:9870/transactions

