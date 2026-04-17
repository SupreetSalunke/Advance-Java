/*
 * 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the countries on console whenever the countries are selected on the list.
 */
package Swings;

import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.event.*;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> countryCapitalMap;

    public CountryCapitalList() {

        // Map for country → capital
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "No single capital"); // continent
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // List Model
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String country : countryCapitalMap.keySet()) {
            model.addElement(country);
        }

        // JList
        countryList = new JList<>(model);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selected = countryList.getSelectedValuesList();

                    for (String country : selected) {
                        System.out.println(country + " -> " + countryCapitalMap.get(country));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setTitle("Country Capital List");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}