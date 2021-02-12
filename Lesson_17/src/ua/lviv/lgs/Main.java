package ua.lviv.lgs;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Integer[] array = { 24, 2, -4, 7, 294, 781, 24, -2, 7, 104 };

		Collection c = new Collection(array);

		Iterator iteratorForward = c.forward();

		System.out.println(Arrays.toString(array));
		while (iteratorForward.hasNext()) {
			int next = (int) iteratorForward.next();
			if (next % 2 != 0) {
				next = 0;
			}
			System.out.println(next);
		}
		System.out.println();
		Iterator iteratorBackward = c.backward();

		while (iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}

	}

}
