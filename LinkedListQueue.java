
public class LinkedListQueue {

    Node head, tail;

    public void tambahAntrian(Kendaraan k) {
        Node newNode = new Node(k);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) {
            return null;
        }
        Kendaraan k = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return k;
    }

    public void tampilkanAntrian() {
        Node temp = head;
        System.out.println("Kendaraan dalam Antrian : ");
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}