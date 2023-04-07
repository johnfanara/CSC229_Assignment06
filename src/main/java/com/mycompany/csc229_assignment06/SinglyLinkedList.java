package com.mycompany.csc229_assignment06;

/**
 *
 * @author johnf
 */
import java.util.Scanner;

public class SinglyLinkedList {
    public static void main(String[] args) {
        System.out.println("Please enter number to get all primes up to it: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList primeList = new LinkedList();
        primeList.getPrimes(primeList, n);
        System.out.println("Linked List of primes from 1 to " + n);
        primeList.printList();
        
        System.out.println("All primes that contain digit 3: ");
        LinkedList numList = new LinkedList();
        numList = numList.getThrees(primeList);
        numList.printList();
        
        System.out.println("Sum of all nodes of LinkedList: ");
        int sum = numList.getSum();
        System.out.println(sum);
    }
}
