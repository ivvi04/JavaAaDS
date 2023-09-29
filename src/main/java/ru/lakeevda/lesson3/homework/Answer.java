package ru.lakeevda.lesson3.homework;

public class Answer {
    Node head;
    public void reverse() {
        // ������� ���� ������� ����
        Node prev = null;
        Node current = head;

        // ���� �� ��������� ����� ������
        while (current != null) {
            // ��������� ������ �� ��������� ����
            Node next = current.next;
            // �������� ������ �������� ���� �� ���������� ����
            current.next = prev;
            // ���������� ��������� prev �� ������� ����
            prev = current;
            // ���������� ��������� current �� ��������� ����
            current = next;
        }

        head = prev;
    }
}
