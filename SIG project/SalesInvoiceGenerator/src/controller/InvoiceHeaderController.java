/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author MMaher
 */
public class InvoiceHeaderController {
    
    public static void loadFile(JMenuItem loadMenuItem, JTable headerTable) {
        JFileChooser fileChooser = new JFileChooser();
        JLabel selected_file = new JLabel();
        selected_file.setBounds(0, 5, 100, 200);

      


           
        loadMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser filechooser = new JFileChooser();

                int i = filechooser.showOpenDialog(null);
                if (i == JFileChooser.APPROVE_OPTION) {
                    File f = filechooser.getSelectedFile();
                    String filepath = f.getPath();
                    String fi = f.getName();
                    //Parsing CSV Data
                    System.out.print(filepath);
                    selected_file.setText(fi);
                    DefaultTableModel csv_data = new DefaultTableModel();

                    try {

                        int start = 0;
                        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                        org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                        for (CSVRecord csvRecord : csvParser) {
                            if (start == 0) {
                                start = 1;
                                csv_data.addColumn(csvRecord.get(0));
                                csv_data.addColumn(csvRecord.get(1));
                                csv_data.addColumn(csvRecord.get(2));
                                csv_data.addColumn(csvRecord.get(3));

                            } else {
                                Vector row = new Vector();
                                row.add(csvRecord.get(0));
                                row.add(csvRecord.get(1));
                                row.add(csvRecord.get(2));
                                row.add(csvRecord.get(3));
                                csv_data.addRow(row);
                            }
                        }

                    } catch (Exception ex) {
                        System.out.println("Error in Parsing CSV File");
                    }

                    headerTable.setModel(csv_data);

                }
            }
        });

    }

   

}



