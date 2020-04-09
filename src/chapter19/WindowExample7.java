package chapter19;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PrintButton implements ActionListener{
    JTable table;
    PrintButton(JTable table){
        this.table =table;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        TableModel tmodel = table.getModel();
        int rowNum = tmodel.getRowCount();
        int colNum = tmodel.getColumnCount();
        for(int col = 0 ; col < colNum; col++){
            System.out.print(tmodel.getColumnName(col)+"\t");
        }
        System.out.println();
        for(int row = 0 ; row < rowNum; row++){
            for(int col = 0; col < colNum; col++){
                Object obj = tmodel.getValueAt(row, col);
                System.out.print(obj + "\t");
            }
            System.out.println();
        }
    }
}


public class WindowExample7 {
    public static void main(String[] args) {
        String colName[] = {"이름", "나이", "성별"};
        Object data[][] = { {"김철순", 24, "남"}, {"배민주", 24, "여"}, {"김종하", 27, "남"}};

        JFrame frame = new JFrame("use JTable");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setLocation(500,400);
        Container contentPane = frame.getContentPane();
        JTable table = new JTable(data, colName);
        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        JButton button = new JButton("출력");
        button.addActionListener(new PrintButton(table));
        contentPane.add(button, BorderLayout.SOUTH);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();;
        frame.setVisible(true);



    }
}
