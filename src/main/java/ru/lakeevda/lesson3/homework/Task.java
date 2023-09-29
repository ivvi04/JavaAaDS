package ru.lakeevda.lesson3.homework;

public class Task {
    public static void main(String[] args) {
        // ������� ��������� ������ 1 -> 2 -> 3 -> 4
        Node head;
        if (args.length == 0) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
        } else {
            head = new Node(Integer.parseInt(args[0]));
            head.next = new Node(Integer.parseInt(args[1]));
            head.next.next = new Node(Integer.parseInt(args[2]));
            head.next.next.next = new Node(Integer.parseInt(args[3]));
        }

        // ��������� ������ ������ � ���� ������ Answer
        Answer ans = new Answer();
        ans.head = head;
        // ����������� ������� ��������� ������
        ans.reverse();

        // ������� ��������������� ������� ��������� ������
        Node current = ans.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
