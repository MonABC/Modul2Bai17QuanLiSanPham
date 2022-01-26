package com.company;

import java.util.ArrayList;
import java.util.List;

public class QuanLiSanPham {
    private List<SanPham> sanPhams = new ArrayList<>();

    public int size() {
        return sanPhams.size();
    }
    public void hienThiSanPham (){
        for (SanPham sanPham: sanPhams){
            System.out.println(sanPham);
        }
    }
    public void themSanPham (SanPham sanpham) {
        sanPhams.add(sanpham);

    }
    public void timKiemSanPham(String tenSanPham){
        int index =-1;
        for (int  i= 0; i<sanPhams.size(); i++) {
            if (sanPhams.get(i).getTenSanPham().equals(tenSanPham));
            index =i;
            break;
        }
        if (index ==-1 ){
            System.out.println("không có sản phâm nảy");
        }else {
            System.out.println("sản phẩm: "+sanPhams.get(index));
        }

    }


}
