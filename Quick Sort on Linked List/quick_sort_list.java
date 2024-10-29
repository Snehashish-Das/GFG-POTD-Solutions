//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class SortLL {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            addToTheLast(head);

            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(str[i]);
                addToTheLast(new Node(a));
            }

            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);

            printList(node);
            System.out.println();
        
System.out.println("~");
}
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
    public static Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: empty or single element list is already sorted
        }
        
        // Partition the list around the pivot
        Node[] partitioned = partition(head);
        Node left = quickSort(partitioned[0]); // Sort the left part
        Node pivot = partitioned[1];
        Node right = quickSort(partitioned[2]); // Sort the right part
        
        // Combine the sorted left part, pivot, and right part
        return concatenate(left, pivot, right);
    }

    private static Node[] partition(Node head) {
        Node pivot = head; // Choose head as pivot for simplicity
        Node curr = head.next; // Start with the element after pivot
        
        // Dummy nodes to form two lists: left (values < pivot) and right (values >= pivot)
        Node leftDummy = new Node(0), rightDummy = new Node(0);
        Node leftTail = leftDummy, rightTail = rightDummy;
        
        while (curr != null) {
            if (curr.data < pivot.data) {
                leftTail.next = curr;
                leftTail = leftTail.next;
            } else {
                rightTail.next = curr;
                rightTail = rightTail.next;
            }
            curr = curr.next;
        }
        
        // Close the two lists to avoid cycles
        leftTail.next = null;
        rightTail.next = null;

        // Return the left part, pivot, and right part
        return new Node[]{leftDummy.next, pivot, rightDummy.next};
    }

    private static Node concatenate(Node left, Node pivot, Node right) {
        // If there is a left part, find the end and connect it to pivot
        if (left != null) {
            Node temp = left;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = pivot;
        } else {
            left = pivot;
        }
        
        // Connect pivot to right part
        pivot.next = right;
        
        return left;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
