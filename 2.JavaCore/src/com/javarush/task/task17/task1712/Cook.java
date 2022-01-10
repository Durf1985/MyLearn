package com.javarush.task.task17.task1712;

public class Cook implements Runnable {// повар
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    // нужно ждать, если не нужно готовить.
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    // вопрос - нужно ли готовить заказ через проверку очереди, не нужно = false. нужно = true
    private boolean needToCookOrders() {

        return !Manager.getInstance().getOrderQueue().isEmpty(); // вернуть false если isEmpty = true... блять, религия не позволяет вернуть тру???
    }                                                           // тогда вся остальная логика будет понятна, очередь пуста? это правда! повар отдыхает...

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // повар берет заказ из очереди
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готовим блюдо
        Dishes dishes = new Dishes(order.getTableNumber());
        manager.getDishesQueue().add(dishes);//  это готовое блюдо
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
    }
}
