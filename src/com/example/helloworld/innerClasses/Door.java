package com.example.helloworld.innerClasses;

public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus() {
        if(lock.isLock()) {
            System.out.println("Shop is closed!");
        } else {
            System.out.println("Welcome to the shop!");
        }
    }

    class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }


    }
}
