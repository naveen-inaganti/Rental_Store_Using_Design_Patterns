# Rental_Store_Using_Design_Patterns
Rental store basic functionalities implemented using Design Principles

I designed Buy class which takes care of transaction done in case of buying list of Objects.
Buy class looks for category of object to buy and handle respective transaction using its own StrategyClass to buy.
Rental class looks for catefory of object to rent and handle respective transaction using its own StrategyClass to rent.
Interfaces ‘StrategyForObjectBuy’ and ‘StrategyForObjectRental’ and implemented by respective categories by giving respective function definition to calculate amount and frequent points.
‘RentalObjectList’ will serve as instance provider based on the among different categories of objects that can be rented.
‘BuyObjectList’ will be to used to provide instance of an Object based on its category like ps4, movie, xbox etc... to buy.
Each category is assigned with two strategies, one for rental and other for Buying so it will be easy handle any changes in the future.
Any addition categories can include in set of Objects by extending ListObject class.
REGULAR, CHILDREN, NEW is included in every category.
Decorator Design Pattern can be used to implement coupon system to cart without changing current design.
Payment Methods can also be added in future without changing design.
Sample output shows rental and buying transaction for a customer
