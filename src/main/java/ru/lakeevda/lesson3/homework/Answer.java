package ru.lakeevda.lesson3.homework;

public class Answer {
    Node head;
    public void reverse() {
        // Введите свое решение ниже
        Node prev = null;
        Node current = head;

        // Пока не достигнем конца списка
        while (current != null) {
            // Сохраняем ссылку на следующий узел
            Node next = current.next;
            // Изменяем ссылку текущего узла на предыдущий узел
            current.next = prev;
            // Перемещаем указатель prev на текущий узел
            prev = current;
            // Перемещаем указатель current на следующий узел
            current = next;
        }

        head = prev;
    }
}
