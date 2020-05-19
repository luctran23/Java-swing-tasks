
package p1;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CustomTable extends AbstractTableModel{
    // khai bao tieu de cua moi cot
    private String name[] = {"Ma sv", "Ten sv", "Tuoi"};
    // khai bao lop chua kieu du lieu cua tung cot
    private Class classes[] = {String.class, String.class, Integer.class};
    
    // tao 1 ArrayList de luu SinhVien vao
    ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();
    
    // CustomTable contructor
    
    public CustomTable(ArrayList<SinhVien> dsSv){
        this.dsSv = dsSv;
    }
    @Override
    public int getRowCount() {
        return dsSv.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dsSv.get(rowIndex).getMasv();
        }
        if(columnIndex == 1){
            return dsSv.get(rowIndex).getTensv();
        }
        if(columnIndex == 2){
            return dsSv.get(rowIndex).getTuoi();
        }
        return null;
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; 
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
    
}
