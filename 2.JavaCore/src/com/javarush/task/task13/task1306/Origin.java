package com.javarush.task.task13.task1306;

public class Origin {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        // у интерфейса создаем объект наследник, сюда возвращается this
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            // при реализации интерфейса можно менять тип возвращаемого методом значения с родителя на наследника и обратно.
            this.id = id;
            this.name = name;
            return this;
        }
    }

}


