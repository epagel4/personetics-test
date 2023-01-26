package com.personetics.test;

public class Node<T> {
    class node<T> {
        final T data;
        node<T> next;

        node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    class list<T> {
        node<T> head;
        private int newlength = 0;

        list() {
            this.head = null;
        }

        void add(T data) {
            node<T> newtemp = new node<>(data);
            if (this.head == null) {
                head = newtemp;
            } else {
                node<T> X = head;
                while (X.next != null) {
                    X = X.next;
                }
                X.next = newtemp;
            }
            newlength++;
        }

        void add(int newposition, T data) {
            if (newposition > newlength + 1) {
                return;
            }
            if (newposition == 1) {
                node<T> newtemp = head;
                head = new node<T>(data);
                head.next = newtemp;
            }
        }

        public String toString() {
            String S = "{ ";
            node<T> X = head;
            if (X == null)
                return S + " }";
            while (X.next != null) {
                S += X.data + " -> ";
                X = X.next;
            }
            S += String.valueOf(X.data);
            return S + " }";
        }
    }
}
