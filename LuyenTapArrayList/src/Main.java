
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author nhattpam
 */
public class Main {           //int             a

    //Cau1: Count price greater than 10$
    public void countlonhon10(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10) {
                count++;
            }
        }
        System.out.println("Price>10$: " + count);
    }

    //Cau 2: Count price greater than 10$ and worse 20$
    public void countlonhon10andbehon20(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10 && o.getPrice() < 20) {
                count++;
            }
        }
        System.out.println("Price>10$ & Price<20$: " + count);
    }

    //Cau 3: Display the information of the Book with index 5
    public void HienThiThongTinBookViTriSo5(ArrayList<Book> list) {
        //index=5
        System.out.println("Thong tin vi tri thu 5: " + list.get(5));
    }

    //Cau 4: Add a book into the arrayList
    public void Them1BookvaoArrayList(ArrayList<Book> list) {
        Book b6 = new Book("Songoku", 1, 20, "truyen tranh");
        list.add(b6);
        for (Book o : list) {
            System.out.println(o);

        }
    }

    //Cau 5: Add a book into the index 4
    public void ThemBookVaoViTriThu4(ArrayList<Book> list) {
        Book b7 = new Book("than dong dat viet", 1, 20, "truyen tranh");
        list.add(4, b7);
        for (Book o : list) {
            System.out.println(o);
        }

    }
    //Cau 6: Update brand the book at index 4 to "truyen dai"

    /*(cach 1)
//    public void UpdateBrandBookIndex4toTruyenDai(ArrayList<Book> list, int i){
//        for (int j = 0; j < list.size(); j++) {
//            if(j == i){
//                list.get(j).setBrand("truyen dai");
//            }
//        }
//        for (Book o : list) {
//            System.out.println(o);
//        }
//        
//    }
     */
    //(Cach 2)
    public void UpdateBrandBookIndex4toTruyenDai(ArrayList<Book> list) {
        list.get(4).setBrand("truyen dai");
        System.out.println(list.get(4));
    }

    //Cau 7: Remove or delete Book at index 3
    public void XoaBookOviTriSo3(ArrayList<Book> list) {
        list.remove(3);
        for (Book o : list) {
            System.out.println(o);
        }
    }

    //Cau 8: Hien thi so luong sach co brand la "truyen tranh"
    public int HienThiSoLuongSachlaTruyenTranh(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getBrand().equals("truyen tranh")) {
                count++;
            }
        }
        return count;
    }

    //Cau 9: Count the amount of Book which name starts with C
    public int SoluongSachCoTenBatDauBangC(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getName().startsWith("c")) {
                count++;
            }
        }
        return count;
    }
    //Cau 10: Sale all 10%
    public void saleALL(ArrayList<Book> list){
        for (Book o : list) {
            double price = o.getPrice() * 0.9;
            o.setPrice(price);
            System.out.println(o);
        }
    }
    
    //Cau 11: Neu brand la "truyen dai " thi giam gia 10%
    public void SaleTruyenDai10(ArrayList<Book> list){
        for (Book o : list) {
            if(o.getBrand().equals("truyen dai")){
                double price = o.getPrice() * 0.9;
                o.setPrice(price);
            }
            System.out.println(o);
        }
    }
    
    //Cau 12: Sap xep tang dan theo code
    public void SortTheoCode(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>(){
            @Override
            public int compare(Book t, Book t1) {
                return t.getCode() - t1.getCode();
            }
            
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }
    //Cau 13: Sap xep tang dan theo name
    public void SortTheoName(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>(){
            @Override
            public int compare(Book t, Book t1) {
                return t.getName().compareToIgnoreCase(t1.getName());
            }
            
        });
        for (Book o : list) {
            System.out.println(o);
            
        }
    }
    
    
    //Cau 14: Sap xep theo price
    public void SortTheoPrice(ArrayList<Book> list){
        Collections.sort(list, new Comparator<Book>(){
            @Override
            public int compare(Book t, Book t1) {
                if(t.getPrice() > t1.getPrice()){
                    return 1;
                }else if(t.getPrice() < t1.getPrice()){
                    return -10000;
                }else 
                    return 0;
            }
            
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<Book> arrList = new ArrayList<>();
        Book b0 = new Book();
        b0.setName("conan");
        b0.setCode(0);
        b0.setPrice(10);
        b0.setBrand("truyen tranh");

        Book b1 = new Book("doremon", 5, 20, "truyen tranh");
        Book b2 = new Book("lao hac", 1, 15, "truyen dai");
        Book b3 = new Book("mat biec", 4, 40, "truyen dai");

        String name4 = "chi pheo";
        int code4 = 2;
        double price4 = 50;
        String brand4 = "truyen ngan";
        Book b4 = new Book(name4, code4, price4, brand4);
        Book b5 = new Book("tam cam", 0, 40, "truyen dai");

        arrList.add(b0);
        arrList.add(b1);
        arrList.add(b2);
        arrList.add(b3);
        arrList.add(b4);
        arrList.add(b5);

        Main main = new Main();
        main.countlonhon10(arrList);//cau1
        main.countlonhon10andbehon20(arrList);//cau2
        main.HienThiThongTinBookViTriSo5(arrList);//cau3
        System.out.println("====================================================================================================");
        main.Them1BookvaoArrayList(arrList);//cau4
        System.out.println("----------------------------------------------------------");
        main.ThemBookVaoViTriThu4(arrList);//cau5
        System.out.println("***********************************************************");
//        main.UpdateBrandBookIndex4toTruyenDai(arrList, code4); cach1 cau6
        main.UpdateBrandBookIndex4toTruyenDai(arrList);
        System.out.println("........................................................................");
        main.XoaBookOviTriSo3(arrList);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        int count = main.HienThiSoLuongSachlaTruyenTranh(arrList);
        System.out.println("So luong truyen tranh: " + count);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        
        int count1 = main.SoluongSachCoTenBatDauBangC(arrList);
        System.out.println("So luong sach ten bat dau bang c: " + count1);
        System.out.println("---------------------------------------------------------------------------------");
        
        main.saleALL(arrList);//cau10
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        main.SaleTruyenDai10(arrList);//cau11
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        main.SortTheoCode(arrList);//cau12
        
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        main.SortTheoName(arrList);//cau13
        
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        main.SortTheoPrice(arrList);//cau14
        
    }
}
