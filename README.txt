Natwest Demo Application

The project demonstrates a typical REST API structure
to manage a simple bank account / transfers scenareo.

There are two endpoints accessible at:

/api/v1/accounts
/api/v1/transactions

The Demo application has been pre-constructed with the following values:

Account Objects:
[
{"accountNumber":11111,"balance":111.11},
{"accountNumber":22222,"balance":222.22},
{"accountNumber":33333,"balance":333.33}
]

Transfer Objects:
[
{"accountNumberSource":11111,"accountNumberDestination":22222,"amount":100.0},
{"accountNumberSource":22222,"accountNumberDestination":33333,"amount":100.0},
{"accountNumberSource":33333,"accountNumberDestination":11111,"amount":100.0}
]

Tests have been provided to demonstrate creating a new TransferObjects by using POST.
Retrieval of information can be done using GET. Each test in turn update the balance 
to the source/target accounts.
