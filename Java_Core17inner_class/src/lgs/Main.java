package lgs;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {

		Integer[] array = { 11, 453, 42, -34, 10, 47, -582, 51, 86, 5, 45 };

		Collection collection = new Collection(array);

		System.out.println("Display an array from beginning to end, replacing odd elements with zero:");
		Iterator Forward = collection.createForward();

		while (Forward.hasNext()) {
			Integer next = Forward.next();

			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}

		System.out.println();

		System.out.println("We output the array one element from the end to the beginning:");
		Iterator Backward = collection.createBackward();

		while (Backward.hasNext()) {
			Integer next = Backward.next();

			System.out.println(next);
		}

		System.out.println();

		System.out.println("We display every third odd element of the array on the screen from beginning to end:");
		Iterator iteratorAnonymous = collection.createAnonymousIterator();

		int i = 1;
		while (iteratorAnonymous.hasNext()) {
			Integer next = iteratorAnonymous.next();

			if (i % 3 == 0) {
				if (next % 2 != 0) {
					System.out.println(next);
				}
			}

			i++;
		}

		System.out.println();

		System.out.println("We display every fifth even element minus 100 of the array from beginning to end:");
		Iterator iteratorLocal = collection.createLocalIterator();

		int a = 1;
		while (iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();

			if (a % 5 == 0) {
				if (next % 2 == 0) {
					System.out.println(next - 100);
				}
			}

			a++;
		}

		System.out.println();

		System.out.println("We display every second even element of the array from beginning to end as odd:");
		Iterator iteratorStatic = Collection.createStaticIterator();

		int o = 1;
		while (iteratorStatic.hasNext()) {
			Integer next = iteratorStatic.next();

			if (o % 2 == 0) {
				if (next % 2 == 0) {
					System.out.println(next + 1);
				}
			}

			o++;
		}

	}

}
