package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

    }

    public static void main(String[] args) {
        IncomeData data = new IncomeData() {
            public String getCountryCode() {
                return "CA";
            }

            public String getCompany() {
                return "JavaRush Ltd.";
            }

            public String getContactFirstName() {
                return "Алексей";
            }

            public String getContactLastName() {
                return "Локтионов";
            }

            public int getCountryPhoneCode() {
                return 38;
            }

            public int getPhoneNumber() {
                return 501234567;
            }

        };
        IncomeDataAdapter adapter = new IncomeDataAdapter(data);
        System.out.println(adapter.getCompanyName());
        System.out.println(adapter.getCountryName());
        System.out.println(adapter.getName());
        System.out.println(adapter.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        }

        public String getCountryName() {
            for (Map.Entry<String, String> entry :
                    countries.entrySet()) {
                if (entry.getKey().equals(data.getCountryCode())) {
                    return entry.getValue();
                }
            }
            return null;
        }

        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        public String getPhoneNumber() { //For example: +38(050)123-45-67
            String phone = String.format("%010d", data.getPhoneNumber());
            String phoneFormat = String.format("+%d(%s)%s-%s-%s",
                    data.getCountryPhoneCode(),
                    phone.substring(0, 3),
                    phone.substring(3, 6),
                    phone.substring(6, 8),
                    phone.substring(8, 10));
            return phoneFormat;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}