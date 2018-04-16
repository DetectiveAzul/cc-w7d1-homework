## Homework.

Practice what you have learned about using

* classes, 
* abstract classes
* interfaces

to model and test a ThemePark.

## ThemePark

Model a ThemePark (with various Attraction and Stalls) and it's Visitors.

### MVP:


1. Visitor has age, height, money
2. Using a 'Attraction' abstract class, create some classes for Rollercoaster, Dodgems, Park, Playground.
3. Using a 'Stall' abstract class, create some classes for IceCream, CandyFloss, TobaccoStall.
5. Interfaces would be:

	IChargeable needs: double price()
	IRestrictable needs: Boolean isAllowedIn(Person)
	IEnjoyable needs: int getFunRating()

	- Rollercoster is IRestrictable and requires you to be over 145cm tall and over 12 years of age
	- Playground is IRestrictable and has a maximum age of 15
	- TobaccoStall is IRestrictable and has a minimum age of 18

	- All Stalls are IChargeable because they have a price
	- Park and Playground have no price to enter, but other Attractions do.

	- everything in a park is IEnjoyable and returns some fun rating from 1 to 10.

4. ThemePark stores everything that is enjoyable in a collection.
5. ThemePark has a method that can return a string with all enjoyable things together with their fun ratings, like:

	```
		Rollercoster: 4, Dodgems: 8, Park: 2, IceCream: 6, TobaccoStall: 1
	```

### Extension:

1. Make Attractions keep a list of visitors on them. Attraction should have a enter(Visitor) method which takes a Visitor.
2. On Dodgems first 2 Visitors ride for free.
3. The faster a Rollercoster is, the more it charges.
4. Add boolean to Visitor hadDinner. You can't have IceCream if you haven't had dinner, but you can't ride a rollercoaster if you did have dinner (because you'd get sick).  
