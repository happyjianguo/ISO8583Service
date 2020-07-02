//package com.swiftpass.isoservice.pojo;
//
//import com.wft.demo8583.utils.ByteUtil;
//
///**
// * @Author: EdmanWang
// * @date: 2020/3/31 13:42
// */
//public class Bitmap {
//
//    private byte[] bitmap;
//
//    public Bitmap() {
//        this.init();
//    }
//
//    public void init() {
//        bitmap = ByteUtil.hexString2Bytes("00000000000000000000000000000000");
//    }
//
//    public Bitmap(String bitmap) {
//        this.bitmap = ByteUtil.hexString2Bytes(bitmap);
//    }
//
//    public String getBitmap() {
//        return ByteUtil.bytes2HexString(bitmap);
//    }
//
//    public void setBitmap(String bitmap) {
//        this.bitmap = ByteUtil.hexString2Bytes(bitmap);
//    }
//
//    public void clear() {
//        bitmap = null;
//    }
//
//    public void clearBit(int i) {
//        i--;
//        bitmap[(i) / 8] &= ~(0x01 << (7 - (i) % 8));
//    }
//
//    /**
//     * 设置位图，更新位图数据
//     *
//     * @param i
//     */
//    public void setBit(int i) {
//        int index = (i == 0) ? 0 : (i / 8);
//        if (i == 0) {
//            bitmap[0] |= 0x01 << 7;
//        } else {
//            i--;
//            bitmap[index] |= 0x01 << (7 - (i) % 8);
//        }
//    }
//
//    /**
//     * 根据位图索引值拿到对应的数据信息
//     *
//     * @param i
//     * @return
//     */
//    public boolean getBit(int i) {
//        if (i == 0) {
//            return bitmap[0] != 0x00;
//        }
//        i--;
//        byte b = bitmap[(i) / 8];
//        b &= (0x01 << (7 - (i) % 8));
//        return b != 0x00;
//    }
//
//    public static boolean checkSwitch(int para, int index) {
//        int flag = 0x01 << (31 - index);
//        int res = flag & para;
//        return res != 0;
//    }
//
//    public static int setSwitch(int para, int index) {
//        int flag = 0x01 << (31 - index);
//        return para | flag;
//    }
//
//    public static int clearSwitch(int para, int index) {
//        int flag = 0x01 << (31 - index);
//        return ~flag & para;
//    }
//
//    @Override
//    public String toString() {
//        if (bitmap != null) {
//            return ByteUtil.bytes2HexString(bitmap);
//        } else {
//            return "";
//        }
//    }
//}
