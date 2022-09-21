

>This homework was modified several times, hope i didnt forget anything and its not too messy

So tasks were merged in two pairs.
### *tasks 1-5* combined into `animals` package.
Animal has an inner stats class. 
It's being inherited in child classes and can be easily <sub> <sub>(i hope so)</sub> </sub> extended with new stats or types of animal



### **tasks 7-8** combined to `amusement_park` package
`Park` has inner classes `Food` and `Attraction` 
~~which idea suggests to make static, despite that I create their objects~~

So it's possible to add different stuff to Park object, initialize it with name, cost and description. 
They also have additional fields which are really used only in `toString()` method

`Food` and `Attraction` extends `BuyableObjects` from `Payment` class. 
Main idea is about buying tickets and ordering food in amusement park, like it could be IRL

`Payment` object can be printed out, showing all positions in list with calculating total cost