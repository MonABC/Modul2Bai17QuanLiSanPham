package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham(1,"kem", "a"));
        sanPhams.add(new SanPham(2,"kem1", "a"));
        sanPhams.add(new SanPham(3,"kem2", "a"));
        sanPhams.add(new SanPham(4,"kem3", "a"));
        sanPhams.add(new SanPham(5,"kem4", "a"));

        vietFile(sanPhams);
        List<SanPham> sp1 = docFile();
      for (SanPham sp: sanPhams) {
          System.out.println(sp);
      }

    }
    public static List<SanPham> docFile() {
        List<SanPham> sp1 = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("SanPham.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            sp1 = (List<SanPham>) ois.readObject();
            is.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sp1;
    }
    public static void vietFile(List<SanPham> sanPhams) {
        try {
            OutputStream os= new FileOutputStream("SanPham.txt");
            ObjectOutputStream oos =new ObjectOutputStream(os);
            oos.writeObject(sanPhams);
            os.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//        QuanLiSanPham quanLiSanPham = new QuanLiSanPham();
//        int choice =-1;
//        do {
//            menu();
//            choice = scanner.nextInt();
//            switch (choice){
//                case 1: {
//                    int size = quanLiSanPham.size();
//                    if (size==0) {
//                        System.out.println(" không có sản phẩm nào");
//                    }else {
//                        System.out.println("danh sách sản phâm");
//                        quanLiSanPham.hienThiSanPham();
//                    }
//                    break;
//
//                }
//                case 2: {
//                    SanPham sanPham = getSanPham();
//                    quanLiSanPham.themSanPham(sanPham);
//                    break;
//                }
//
//                case 3: {
//                    System.out.println("nhập tên sản phẩm cần tìm");
//                    scanner.nextLine();
//                    String tenSanPham = scanner.nextLine();
//                    quanLiSanPham.timKiemSanPham(tenSanPham);
//                    break;
//                }
//            }
//        }while (choice!=0);
//
//
//
//
//
//
//    }
//
//    private static SanPham getSanPham() {
//        System.out.println("thêm sản phẩm");
//        System.out.println("mời nhập mã sản phẩm");
//        int msp = scanner.nextInt();
//        System.out.println("mời nhập tên sản phâm");
//        scanner.nextLine();
//        String ten= scanner.nextLine();
//        System.out.println("mời nhập hãng sản xuất");
//        String hsx = scanner.nextLine();
//        SanPham sanPham = new SanPham(msp, ten, hsx);
//        return sanPham;
//    }
//
//    private static void menu() {
//        System.out.println("---MENU LỰA CHỌN---");
//        System.out.println("1. HIỂN THỊ SẢN PHÂM");
//        System.out.println("2. THÊM SẢN PHÂM");
//        System.out.println("3. TÌM KIẾM SẢN PHẨM");
//        System.out.println("0. THOÁT");
//        System.out.println("mời nhập lựa chọn");
//    }
//    public static void
}
