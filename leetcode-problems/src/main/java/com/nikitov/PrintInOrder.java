package com.nikitov;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @see <a href="https://leetcode.com/problems/print-in-order/">print-in-order</a>
 */
public class PrintInOrder {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread first = new Thread(() -> {
            try {
                foo.first(() -> System.out.println("first"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread second = new Thread(() -> {
            try {
                foo.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread third = new Thread(() -> {
            try {
                foo.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        first.start();
        third.start();
        second.start();
    }
}

class Foo {

    private final Queue<String> queue = new ConcurrentLinkedQueue<>(List.of("first", "second", "third"));
    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            while (!"first".equals(queue.peek())) {
                this.wait();
            }
            queue.poll();
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            this.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (!"second".equals(queue.peek())) {
                this.wait();
            }
            queue.poll();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            this.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (!"third".equals(queue.peek())) {
                this.wait();
            }
            queue.poll();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            this.notifyAll();
        }
    }
}
