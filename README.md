---------------- Checkout System ----------------------------------------------------------------------------------

# CheckoutSystem
Domain model for checkout system.
	This is a command line application. This is written using spring boot with h2 in memory database.
P001, P002,.. P009 are the product code for products already added to the database on startup. If user want to add products at startup then it can be done by editing the "resource\data.sql" file.

Steps :-
On startup, it will prompt user to enter the no of products in the cart.
Then it will ask user to enter the product code, if the product is already present in the database it will ask only for the quantity of product.
If the product is not present in the database it will ask user to enter the category and price details.
After this bill will be printed with product code, quantity, price and taxes applicable. There is also total taxes and total price amount printed for all of the products.

DESIGN 
There are few services designed for the checkout management system.
CheckoutService - process the products added in the cart.
Product service - add/ fetch the existing products.
BillManagement - Calculate the bill and the taxes applicable on the product.
Tax Calculation service - Calculate tax based on the criteria
Display bill service -  Display bill in whatever format is required.

In this project we have achieved loose coupling or IOC using spring DI framework.
If spring DI was not available we would  have implemented IOC using the Factory methods to get beans.

----------------Thank you for reading----------------------------------------------------------------------------------


