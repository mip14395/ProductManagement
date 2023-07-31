package presentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import domain.Service;

public class ProductManagementApp extends JFrame {
    private Service productService;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField idTextField;
    private JTextField nameTextField;
    private JTextField amountTextField;
    private JTextField priceTextField;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton getSumButton;
    private JButton expireButton;

    public ProductManagementApp() {
        setTitle("Product Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setPreferredSize(new Dimension(850, 400));
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Price");
        tableModel.addColumn("VAT");
        tableModel.addColumn("Grade");
        tableModel.addColumn("Supplier");
        tableModel.addColumn("Import date");
        tableModel.addColumn("MFG");
        tableModel.addColumn("EXP");
        tableModel.addColumn("Warranty months");
        tableModel.addColumn("Capacity");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        idTextField = new JTextField();
        nameTextField = new JTextField();
        amountTextField = new JTextField();
        priceTextField = new JTextField();
        JPanel inputPanel = new JPanel(new GridLayout(7, 2));
        addButton = new JButton("Add a product");
        deleteButton = new JButton("Delete a product");
        editButton = new JButton("Edit a product");
        getSumButton = new JButton("Get amount of a category");
        expireButton = new JButton("Seek products a week from expiration");
        inputPanel.add(new JLabel("- ID:"));
        inputPanel.add(idTextField);
        inputPanel.add(new JLabel("- Name:"));
        inputPanel.add(nameTextField);
        inputPanel.add(new JLabel("- Amount:"));
        inputPanel.add(amountTextField);
        inputPanel.add(new JLabel("- Price:"));
        inputPanel.add(priceTextField);
        inputPanel.add(addButton);
        inputPanel.add(deleteButton);
        inputPanel.add(editButton);
        inputPanel.add(getSumButton);
        inputPanel.add(expireButton);
        add(inputPanel);
        pack();
        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProduct();
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editProduct();
            }
        });
        getSumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getSumProduct();
            }
        });
        expireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expiredProduct();
            }
        });
    }

    private void addProduct() {

    }

    private void editProduct() {

    }

    private void deleteProduct() {

    }

    private void getSumProduct() {

    }

    private void expiredProduct() {

    }

}
