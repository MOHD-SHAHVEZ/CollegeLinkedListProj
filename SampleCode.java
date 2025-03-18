package FinalLinkedlistProject; 
import java.util.*; 

public class SampleCode {

    static Scanner user = new Scanner(System.in);
    static int opNum;
    static Slinkedlist ll;
    static Dlinkedlist dll;
    static Clinkedlist Cll;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\nChoose Your Operation and Press Operation Number: ");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Circular Linked List");
            System.out.println("4. Exit");
            System.out.print("Choice the Option: ");
            opNum = user.nextInt();

            switch (opNum) {
                case 1:
                    System.out.println("Singly Linked List Selected");
                    ll = new Slinkedlist();
                    handleSinglyLinkedList(ll);
                    break;

                case 2:
                    System.out.println("Doubly Linked List Selected");
                    dll = new Dlinkedlist();
                    handleDoublyLinkedList(dll);
                    break;

                case 3:
                    System.out.println("Circular Linked List Selected");
                    Cll = new Clinkedlist();
                    handleCircularLinkedList(Cll);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice! Please select a valid option.");
                    break;
            }
        }
        user.close();
    }

    // Function to handle Singly Linked List operations
    public static void handleSinglyLinkedList(Slinkedlist list) {
        while (true) {
            int choice = displayOperation();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to create list: ");
                    int value = user.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at start: ");
                    value = user.nextInt();
                    list.insertAtHead(value);
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    value = user.nextInt();
                    System.out.print("Enter position: ");
                    int pos = user.nextInt();
                    list.insertAt(pos, value);
                    break;

                case 4:
                    System.out.print("Enter value to insert at end: ");
                    value = user.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 5:
                    list.deleteAtStart();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = user.nextInt();
                    list.deleteAt(pos);
                    break;

                case 7:
                    list.deleteAtEnd();
                    break;

                case 8:
                    Slinkedlist secondList = list.split();
                    if (secondList != null) {
                        System.out.println("First half of the list:");
                        list.display();
                        System.out.println("Second half of the list:");
                        secondList.display();
                    }
                    break;

                case 9:
                    System.out.println("Create a second list for merging:");
                    Slinkedlist otherList = new Slinkedlist();
                    System.out.print("Enter number of elements: ");
                    int n = user.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value: ");
                        value = user.nextInt();
                        otherList.insertAtEnd(value);
                    }
                    Slinkedlist mergedList = list.merge(otherList);
                    System.out.println("Merged list:");
                    mergedList.display();
                    break;

                case 10:
                    list.display();
                    break;

                case 11:
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Function to handle Doubly Linked List operations
    public static void handleDoublyLinkedList(Dlinkedlist list) {
        while (true) {
            int choice = displayOperation();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to create list: ");
                    int value = user.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at start: ");
                    value = user.nextInt();
                    list.insertAtHead(value);
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    value = user.nextInt();
                    System.out.print("Enter position: ");
                    int pos = user.nextInt();
                    list.insertAt(pos, value);
                    break;

                case 4:
                    System.out.print("Enter value to insert at end: ");
                    value = user.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 5:
                    list.deleteAtStart();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = user.nextInt();
                    list.deleteAt(pos);
                    break;

                case 7:
                    list.deleteAtEnd();
                    break;

                case 8:
                    Dlinkedlist secondList = list.split();
                    if (secondList != null) {
                        System.out.println("First half of the list:");
                        list.display();
                        System.out.println("Second half of the list:");
                        secondList.display();
                    }
                    break;

                case 9:
                    System.out.println("Create a second list for merging:");
                    Dlinkedlist otherList = new Dlinkedlist();
                    System.out.print("Enter number of elements: ");
                    int n = user.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value: ");
                        value = user.nextInt();
                        otherList.insertAtEnd(value);
                    }
                    Dlinkedlist mergedList = list.merge(otherList);
                    System.out.println("Merged list:");
                    mergedList.display();
                    break;

                case 10:
                    list.display();
                    break;

                case 11:
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Function to handle Circular Linked List operations
    public static void handleCircularLinkedList(Clinkedlist list) {
        while (true) {
            int choice = displayOperation();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to create list: ");
                    int value = user.nextInt();
                    list.create(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at start: ");
                    value = user.nextInt();
                    list.insertStart(value);
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    value = user.nextInt();
                    System.out.print("Enter position: ");
                    int pos = user.nextInt();
                    list.insertMiddle(pos, value);
                    break;

                case 4:
                    System.out.print("Enter value to insert at end: ");
                    value = user.nextInt();
                    list.insertLast(value);
                    break;

                case 5:
                    list.deleteStart();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = user.nextInt();
                    list.deleteMiddle(pos);
                    break;

                case 7:
                    list.deleteLast();
                    break;

                case 8:
                    Clinkedlist secondList = new Clinkedlist();
                    list.split(secondList);
                    System.out.println("First half of the list:");
                    list.display();
                    System.out.println("Second half of the list:");
                    secondList.display();
                    break;

                case 9:
                    System.out.println("Create a second list for merging:");
                    Clinkedlist otherList = new Clinkedlist();
                    System.out.print("Enter number of elements: ");
                    int n = user.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter value: ");
                        value = user.nextInt();
                        otherList.insertLast(value);
                    }
                    list.merge(otherList);
                    System.out.println("Merged list:");
                    list.display();
                    break;

                case 10:
                    list.display();
                    break;

                case 11:
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Display operations menu
    public static int displayOperation() {
        System.out.println("\nOperations:");
        System.out.println("1. Create");
        System.out.println("2. Insert Start");
        System.out.println("3. Insert Middle");
        System.out.println("4. Insert Last");
        System.out.println("5. Delete Start");
        System.out.println("6. Delete Middle");
        System.out.println("7. Delete Last");
        System.out.println("8. Split");
        System.out.println("9. Merge");
        System.out.println("10. Display");
        System.out.println("11. Back");
        System.out.print("Choice the Following Option and Press the Option Number: ");
        return user.nextInt();
    }

    // Singly Linked List Node
    static class SNode {
        int data;
        SNode next;

        SNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Singly Linked List
    static class Slinkedlist {
        SNode head = null;
        SNode tail = null;
        int size = 0;

        // Insert at head
        void insertAtHead(int val) {
            SNode newNode = new SNode(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        // Insert at end
        void insertAtEnd(int val) {
            SNode newNode = new SNode(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        // Insert at a specific position
        void insertAt(int idx, int val) {
            if (idx <= 0) {
                insertAtHead(val);
                return;
            }
            if (idx >= size) {
                insertAtEnd(val);
                return;
            }
            SNode temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            SNode newNode = new SNode(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        // Delete at start
        void deleteAtStart() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        }

        // Delete at end
        void deleteAtEnd() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next == null) {
                head = tail = null;
            } else {
                SNode temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            size--;
        }

        // Delete at a specific position
        void deleteAt(int idx) {
            if (head == null || idx < 0 || idx >= size) {
                System.out.println("Invalid index!");
                return;
            }
            if (idx == 0) {
                deleteAtStart();
                return;
            }
            SNode temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            size--;
        }

        // Split the list into two halves
        Slinkedlist split() {
            if (head == null || head.next == null) {
                System.out.println("List is too small to split!");
                return null;
            }
            SNode slow = head;
            SNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Slinkedlist secondList = new Slinkedlist();
            secondList.head = slow.next;
            secondList.tail = tail;
            tail = slow;
            tail.next = null;
            return secondList;
        }

        // Merge two sorted lists
        Slinkedlist merge(Slinkedlist other) {
            Slinkedlist mergedList = new Slinkedlist();
            SNode a = this.head;
            SNode b = other.head;

            while (a != null && b != null) {
                if (a.data <= b.data) {
                    mergedList.insertAtEnd(a.data);
                    a = a.next;
                } else {
                    mergedList.insertAtEnd(b.data);
                    b = b.next;
                }
            }
            while (a != null) {
                mergedList.insertAtEnd(a.data);
                a = a.next;
            }
            while (b != null) {
                mergedList.insertAtEnd(b.data);
                b = b.next;
            }
            return mergedList;
        }

        // Display the list
        void display() {
            SNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Doubly Linked List Node
    static class DNode {
        int data;
        DNode prev, next;

        DNode(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    // Doubly Linked List
    static class Dlinkedlist {
        DNode head = null;
        DNode tail = null;
        int size = 0;

        // Insert at head
        void insertAtHead(int val) {
            DNode newNode = new DNode(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        // Insert at end
        void insertAtEnd(int val) {
            DNode newNode = new DNode(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        // Insert at a specific position
        void insertAt(int idx, int val) {
            if (idx <= 0) {
                insertAtHead(val);
                return;
            }
            if (idx >= size) {
                insertAtEnd(val);
                return;
            }
            DNode temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            DNode newNode = new DNode(val);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            size++;
        }

        // Delete at start
        void deleteAtStart() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }

        // Delete at end
        void deleteAtEnd() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next == null) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        // Delete at a specific position
        void deleteAt(int idx) {
            if (head == null || idx < 0 || idx >= size) {
                System.out.println("Invalid index!");
                return;
            }
            if (idx == 0) {
                deleteAtStart();
                return;
            }
            DNode temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            } else {
                tail = temp;
            }
            size--;
        }

        // Split the list into two halves
        Dlinkedlist split() {
            if (head == null || head.next == null) {
                System.out.println("List is too small to split!");
                return null;
            }
            DNode slow = head;
            DNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Dlinkedlist secondList = new Dlinkedlist();
            secondList.head = slow.next;
            secondList.tail = tail;
            tail = slow;
            tail.next = null;
            secondList.head.prev = null;
            return secondList;
        }

        // Merge two sorted lists
        Dlinkedlist merge(Dlinkedlist other) {
            Dlinkedlist mergedList = new Dlinkedlist();
            DNode a = this.head;
            DNode b = other.head;

            while (a != null && b != null) {
                if (a.data <= b.data) {
                    mergedList.insertAtEnd(a.data);
                    a = a.next;
                } else {
                    mergedList.insertAtEnd(b.data);
                    b = b.next;
                }
            }
            while (a != null) {
                mergedList.insertAtEnd(a.data);
                a = a.next;
            }
            while (b != null) {
                mergedList.insertAtEnd(b.data);
                b = b.next;
            }
            return mergedList;
        }

        // Display the list
        void display() {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Circular Linked List Node
    static class CNode {
        int data;
        CNode next;

        CNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Circular Linked List
    static class Clinkedlist {
        CNode head = null;
        CNode tail = null;

        // Create a circular linked list
        void create(int data) {
            CNode newNode = new CNode(data);
            head = tail = newNode;
            tail.next = head;
        }

        // Insert at start
        void insertStart(int data) {
            if (head == null) {
                create(data);
                return;
            }
            CNode newNode = new CNode(data);
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }

        // Insert at end
        void insertLast(int data) {
            if (head == null) {
                create(data);
                return;
            }
            CNode newNode = new CNode(data);
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        // Insert at a specific position
        void insertMiddle(int pos, int data) {
            if (head == null || pos <= 1) {
                insertStart(data);
                return;
            }
            CNode temp = head;
            for (int i = 1; i < pos - 1 && temp.next != head; i++) {
                temp = temp.next;
            }
            CNode newNode = new CNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Delete at start
        void deleteStart() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head == tail) {
                head = tail = null;
                return;
            }
            tail.next = head.next;
            head = head.next;
        }

        // Delete at end
        void deleteLast() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head == tail) {
                head = tail = null;
                return;
            }
            CNode temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }

        // Delete at a specific position
        void deleteMiddle(int pos) {
            if (head == null || pos <= 1) {
                deleteStart();
                return;
            }
            CNode temp = head;
            for (int i = 1; i < pos - 1 && temp.next != head; i++) {
                temp = temp.next;
            }
            if (temp.next == head || temp.next == tail) {
                deleteLast();
                return;
            }
            temp.next = temp.next.next;
        }

        // Split the list into two halves
        void split(Clinkedlist secondList) {
            if (head == null || head.next == head) {
                System.out.println("List is too small to split!");
                return;
            }
            CNode slow = head;
            CNode fast = head;
            while (fast.next != head && fast.next.next != head) {
                slow = slow.next;
                fast = fast.next.next;
            }
            secondList.head = slow.next;
            secondList.tail = tail;
            tail = slow;
            tail.next = head;
            secondList.tail.next = secondList.head;
        }

        // Merge two circular linked lists
        void merge(Clinkedlist other) {
            if (head == null) {
                head = other.head;
                tail = other.tail;
                return;
            }
            if (other.head == null) {
                return;
            }
            tail.next = other.head;
            other.tail.next = head;
            tail = other.tail;
        }

        // Display the list
        void display() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            CNode temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}