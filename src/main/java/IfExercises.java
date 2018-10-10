package tech.bts.precourse.exercises;

import static java.lang.Math.*;

/**
 * Exercises about `if` conditionals.
 */
public class IfExercises {

	public static void main(String[] args) {


		// 1. Define a `price` variable and set some value.
		//    Then print "it's expensive" if the `price` is greater than 1000.
		// 2. Now print "expensive" if it's greater than 1000, and print "cheap" otherwise (use `else`).

		int price = 10000;

		if (price > 1000) {
			System.out.println("expensive");
		} else {
			System.out.println("cheap");
		}



		// 3. Define an `age` variable and set some value. Then just define a `cinemaPrice` variable.
		//    If the person is adult (18 years or more), the price of cinema should be 10, otherwise it should be 5

		int age = 20;
		int cinemaPrice;
		if (age > 18) {
			cinemaPrice = 10;
		} else { cinemaPrice = 5;
		}


		// 4. Now let's say that adults pay 10, teenagers pay 7 and kids pay 5.
		//    Use if / else if / else to set the right price for each age.

		if (age > 18) {
			cinemaPrice = 10;
		} else if (age > 13){
			cinemaPrice = 7;
		} else {
			cinemaPrice = 5;
		}


		// -- Nested statements --
		// Notice that inside an `if` you can put any statements, even another (nested) `if`.
		// Let's see an example.


		int somePrice = 100;


		if (somePrice > 10) {

			// price is not small, let's see if it's very big or not

			// This is a nested "if" (it's inside another "if")
			if (somePrice > 1000) {
				System.out.println("big");
			} else {
				System.out.println("normal");
			}

		} else {
			System.out.println("small");
		}


		// 5. Knowing that, let's say you have some `price` and `age` variables, with some values.
		//    If the person is adult, you want to check the price and, if it's huge (more than 1000), you
		//    want to apply a discount (only if person is adult).
		//    On the other side, if the person is not an adult, you check if the price is small (less than 10) and
		//    in that case you just give the product for free (set price to 0).


		double discount = 0.10;
		if (price > 1000){
			if (age >= 18){
			price = (int) (price * (1 - discount));
			}
			} else if (age <= 18) {
				if (price < 10){
			}
				price = 0;
		}


		// -- Check multiple conditions at the same time ---
		// You can check two conditions by joining them with this operator: `&&`
		// That operator is called "AND" (as in "one thing AND another thing")

		// So let's say you want to check if price is big:
		boolean isBigPrice = somePrice > 1000;
		// Also if person is adult:
		int someAge = 15;
		boolean isAdult = someAge >= 18;

		// Now I want to offer a discount for clients that are adult AND pay a big price.
		// So I check both conditions:
		if (isAdult && isBigPrice) {      // if is adult AND is big price ...


			somePrice = somePrice - 100;
		}

		// 6. Knowing that, try the exercise 5 using the `&&` operator

		// 5. Knowing that, let's say you have some `price` and `age` variables, with some values.
		//    If the person is adult, you want to check the price and, if it's huge (more than 1000), you
		//    want to apply a discount (only if person is adult).
		//    On the other side, if the person is not an adult, you check if the price is small (less than 10) and
		//    in that case you just give the product for free (set price to 0).


		boolean isHugePrice = price > 1000;
		boolean isOld = age >= 18;
		boolean isSmall = price < 10;

		if (isOld && isHugePrice) {
			price = (int) (price * (1 - discount));
		} else if (!isOld && isSmall) {
			price = 0;
		}


		// 7. Let's say you have to calculate if a workout exercise is difficult or not
		//    You know if the person `isMale`, you know the `repetitions` of the exercise and the `weight` to lift.
		//    For men, an exercise is difficult if it has more than 10 repetitions and weight is more than 30 kg.
		//    For women, it's difficult if it has more than 15 repetitions and weight is more than 20 kg.
		//    How could you display if an exercise is difficult given the 3 variables?
		//    Try to do the exercise by assigning the result to a `isDifficult` variable and then printing the message
		//    "it's difficult" or "it's easy" depending on that variable.

		boolean isMale = true;
		int repetitions = 13;
		int weight = 25;

		if (isMale && repetitions > 10 && weight > 30) {
			System.out.println("it's difficult");
		} else if (!isMale && repetitions > 15 && weight > 20){
			System.out.println("it's difficult");
		} else {
			System.out.println("it's easy");
		}

		// -- Logical operators --
		// Besides the AND operator `&&`, there is also the OR operator `||` and the NOT operator `!`.
		// The NOT `!` operator is placed just to the left of the value that we want to "negate".

		// For example, I want to play football if it's warm OR if it doesn't rain. So the condition is:
		boolean isRaining = false;
		boolean isWarm = true;
		if (isWarm || !isRaining) {
			System.out.println("I play football");
		}


		// 8. Remember the condition `if (isAdult && isBigPrice)` of the example above.
		//    Now let's say you want apply the discount if the person is NOT an adult OR the price is big.
		//    Write that `if` statement again, now with the new condition.

		double discount2 = 0.05;
		if (!isAdult || isBigPrice) {
			somePrice = (int) (somePrice * (1 - discount2));
		}


		// 9. This is the most difficult: can you think of an exercise where you need conditions?
		//    Think of some subject you like (sports, cinema, biology, books, economics, etc.) and try
		//    to "solve a problem" like the ones in the previous examples. Describe the situation and
		//    try to code the solution.

		// there are four teams competing for winning the group. Italy, France, Germany, and Ireland.
		// Before the last two matches the rank is: Italy 4 points, France 3, Germany 3, and Ireland 1.
		// Italy plays with Germany and France plays with Ireland.
		// A victory is 3 points, a draw 1 point, and a defeat 0 point.
		// Italy wins with Germany and Ireland wins with France.
		// Display final placement.

		int Italy = 4;
		int Ireland = 1;
		int France = 3;
		int Germany = 3;

		boolean ItalyWin = true;
		boolean IrelandWin = true;
		boolean ItalyDraw = false;
		boolean IrelandDraw = false;


		if (ItalyWin){
			Italy +=3;
		} else  if (ItalyDraw){
			Italy +=1;
			Germany +=1;
		} else {
			Germany +=3;
		}

		if (IrelandWin){
			Ireland +=3;
		} else if (IrelandDraw){
			Ireland +=1;
			France +=1;
		} else {
			France +=3;
		}

		System.out.println("Italy: "+ Italy);
		System.out.println("Ireland: "+ Ireland);
		System.out.println("France: "+ France);
		System.out.println("Germany: "+ Germany);

	}

}