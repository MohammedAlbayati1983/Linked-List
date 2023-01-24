public class LinkedList {
    Node head, current;
    public int n, count;

    public void get(int index) {
        if (head == null)
            System.out.println("The list is empty!!");
        else if (index >= n)
            System.out.println("Index out of bound");
        else if (index == 0)
            System.out.println(head.value);
        else {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
                if (i == index - 1)
                    System.out.println(current.value);
            }
        }
    }

    public void set(int index, int val) {
        if (index >= n)
            System.out.println("Index out of bound");
        else {
            current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
            current.value = val;
        }
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        n++;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null)
            head = node;
        else {
            current = head;
            for (int i = 0; i < n - 1; i++)
                current = current.next;
            current.next = node;
        }
        n++;
    }

    public void insert(int index, int val) {
        Node node = new Node(val);
        if (head == null)
            System.out.println("The list is empty you should use add function!!");
        else if (index >= n)
            System.out.println("Index out of bound");
        else if (index == 0) {
            node.next = head;
            head = node;
        } else {
            current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.next;
            node.next = current.next;
            current.next = node;
        }
        n++;
    }

    public void deleteFirst() {
        head = head.next;
        n--;
    }

    public void deleteLast() {
        if (n == 1)
            head = null;
        else {
            current = head;
            for (int i = 1; i < n - 1; i++)
                current = current.next;
            current.next = null;
        }
        n--;
    }

    public void delete(int index) {
        if (index >= n)
            System.out.println("Index out of bound");
        else if (index == 0) {
            head = head.next;
            n--;
        } else {
            current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.next;
            current.next = current.next.next;
            n--;
        }
    }

    public void indexOf(int val) {
        if (head == null)
            System.out.println("The value is not found because of the list is empty!!");
//        else if (head.value == val)
//            System.out.println("The index of value is " + 0);
        else {
            if (head.value == val){
                System.out.println("The index of value is " + 0);
                count--;
            }
            count++;
            current = head;
            for (int i = 1; i < n; i++) {
                current = current.next;
                if (current.value == val)
                    System.out.println("The index of value is " + i);
                else
                    count++;
            }
            if (count == n)
                System.out.println("The value is not found!!");
        }
    }

    public void size() {
        //System.out.println(n);
        //or we can use below code
        current = head;
        int i = 0;
        while (current != null) {
            current = current.next;
            i++;
        }
        System.out.println(i);
    }

    public void print() {
        if (head == null)
            System.out.println("The list is empty!!");
        else {
            current = head;
            System.out.print("[" + current.value + " ");
            for (int i = 0; i < n - 1; i++) {
                current = current.next;
                System.out.print(current.value + " ");
            }
            System.out.println("\b" + "]");
        }
    }
}
