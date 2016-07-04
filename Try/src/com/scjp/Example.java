package com.scjp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

interface Hungry<E> { void munch(E x); }
interface Carnivore<E extends Animal> extends Hungry<E> {}
interface Herbivore<E extends Plant> extends Hungry<E> {}
abstract class Plant {}
class Grass extends Plant {}
abstract class Animal {}
class Sheep extends Animal implements Herbivore<Plant> {
public void munch(Plant x) {}
}
class Wolf extends Animal implements Carnivore<Sheep> {
public void munch(Sheep x) {}
}

public class Example {

	/*public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		System.out.print(pq.peek() + " ");
		pq.offer("1");
		pq.add("3");
		pq.remove("1");
		System.out.print(pq.poll() + " ");
		if(pq.remove("2")) System.out.print(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek());

	}*/

	public static void main(String[] args) {
		String[] s = {"map", "pen", "marble", "key"};
		Othello o = new Othello();
		Arrays.sort(s,o);
		for(String s2: s) System.out.print(s2 + " ");
		System.out.println(Arrays.binarySearch(s, "map"));
		}
		static class Othello implements Comparator<String> {
		public int compare(String a, String b) { return a.compareTo(b); }
		}
		
}
