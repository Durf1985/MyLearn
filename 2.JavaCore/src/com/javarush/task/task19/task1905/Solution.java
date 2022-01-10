package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {

            public String getCompanyName() {
                return "JavaRush Ltd";
            }


            public String getCountryName() {
                return "Ukraine";
            }
        };
        Contact contact = new Contact() {

            public String getName() {
                return "Ivanov, Ivan";
            }


            public String getPhoneNumber() {
                return "+3(805)0123-4567";
            }
        };
        DataAdapter dataAdapter = new DataAdapter(customer, contact);
        System.out.println(dataAdapter.getCompany());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());
        System.out.println(dataAdapter.getCountryCode());
        System.out.println(dataAdapter.getDialString());
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }


        public String getCountryCode() {
            for (Map.Entry<String, String> entry :
                    countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                    return entry.getKey();
                }
            }
            return null;
        }


        public String getCompany() {
            return customer.getCompanyName();
        }


        public String getContactFirstName() {
            String[] fullName = contact.getName().split(", ");
            return fullName[1];
        }


        public String getContactLastName() {
            String[] fullName = contact.getName().split(", ");

            return fullName[0];
        }


        public String getDialString() {
            String[] call = contact.getPhoneNumber().split("\\W");
            String number;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < call.length; i++) {
                stringBuilder.append(call[i]);

            }
            number = stringBuilder.toString();
            return "callto://+" + number;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}