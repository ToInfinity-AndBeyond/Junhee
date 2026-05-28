import java.util.HashSet;
import java.util.Set;

public class Set_prac {
    public static void main(String[] args) {
        // Example usage of a set
        Set <Integer> mySet = new HashSet<>();

        mySet.add(4);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4); // Duplicate value, will not be added 
        System.out.println("Set contents: " + mySet); // Output may not be in the order of insertion

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(3);
        anotherSet.add(5);
        anotherSet.add(6);
        System.out.println("Another set contents: " + anotherSet);

        Set<Integer> unionSet = new HashSet<>(mySet);
        unionSet.addAll(anotherSet);
        System.out.println("Union of both sets: " + unionSet);

        Set<Integer> intersectionSet = new HashSet<>(mySet);
        intersectionSet.retainAll(anotherSet);
        System.out.println("Intersection of both sets: " + intersectionSet);

        Set<Integer> differenceSet = new HashSet<>(mySet); 
        differenceSet.removeAll(anotherSet);
        System.out.println("Difference of both sets (mySet - anotherSet): " + differenceSet);



        Set<Integer> subset = new HashSet<>();
        subset.add(2);

        Set<Integer> superset = new HashSet<>();
        superset.add(2);
        superset.add(3);

        System.out.println("Is subset a subset of mySet? " + superset.containsAll(subset)); // true
    }
}

// Set: A set is a collection of unique elements. It does not allow duplicate values and does
// not maintain any specific order. Sets are commonly used to store distinct items and perform 
// operations like union, intersection, and difference.


// Key charactersistics of a set: unordered, mutable, contain unchangeable values, only unique elements!

// Subset: A set A is a subset of set B if all elements of A are also elements of B. 
// This can be denoted as A ⊆ B. For example, if A = {1, 2} and B = {1, 2, 3}, then 
// A is a subset of B because all elements of A are present in B. 
// However, if A = {1, 4} and B = {1, 2, 3}, then A is not a subset of B because the 
// element 4 is not present in B. Btw, B is a superset of A in the first case, but not in the second case.


