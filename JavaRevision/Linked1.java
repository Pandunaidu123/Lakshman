package JavaRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


class Linked1
{
	public static void main(String[] args) {
       PriorityQueue<String> pq=new PriorityQueue();
       pq.add("Sanjay");
       //pq.add("Ajay");
       pq.add("Madhavi");
       pq.add("Siddu");
       pq.add("Pandu");
       pq.add("Pandu");
       pq.add("Pandu");
       pq.add("Pandu");
       System.out.println(pq);
       System.out.println("head :  " +pq.element());
       //System.out.println("head :" +pq.peek());
       //System.out.println(pq);
       System.out.println(pq.remove());
	}}