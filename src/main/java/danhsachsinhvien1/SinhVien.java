package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {

    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", ma);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = sdf.parse(ns);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", ma, ten, lop, sdf.format(ns), gpa);
    }

}
