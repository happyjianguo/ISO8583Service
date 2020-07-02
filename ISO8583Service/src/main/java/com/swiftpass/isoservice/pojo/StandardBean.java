//package com.swiftpass.isoservice.pojo;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Author: EdmanWang
// * @date: 2020/3/31 13:44
// */
//public class StandardBean {
//    /**
//     * 报文头
//     */
//    private Head head;
//    /**
//     * 报文类型标识符
//     */
//    private String msgID;
//    /**
//     * 报文位图
//     */
//    private Bitmap bitmap;
//
//    /**
//     * 报文域
//     */
//    private Map<Integer, String> fields;
//
//    public StandardBean() {
//        bitmap = new Bitmap();
//        head = new Head();
//        fields = new HashMap<>();
//    }
//
//
//    public Head getHead() {
//        return head;
//    }
//
//    public void setHead(Head head) {
//        this.head = head;
//    }
//
//    public String getMsgID() {
//        return msgID;
//    }
//
//    public void setMsgID(String msgID) {
//        this.msgID = msgID;
//    }
//
//    public Bitmap getBitmap() {
//        return bitmap;
//    }
//
//    public void setBitmap(Bitmap bitmap) {
//        this.bitmap = bitmap;
//    }
//
//    public Map<Integer, String> getFields() {
//        return fields;
//    }
//
//    public void setFields(Map<Integer, String> fields) {
//        this.fields = fields;
//    }
//
//    public String getField(int index) {
//        String value = null;
//        if (fields.containsKey(index)) {
//            value = fields.get(index);
//        }
//        return value;
//    }
//
//    public void setField(int index, String value) {
//        if (value != null && !value.equals("")) {
//            fields.put(index, value);
//            bitmap.setBit(index);
//            if (index > 64) {
//                bitmap.setBit(0);
//            }
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Map.Entry<Integer, String> entry : fields.entrySet()) {
//            stringBuilder.append(" Field :" + entry.getKey() + " Value :" + entry.getValue());
//        }
//        return "StandardBean{" +
//                "bitmap ='" + bitmap.toString() + '\'' +
//                ", head='" + head.toString() + '\'' +
//                ", msgID='" + msgID + '\'' +
//                stringBuilder.toString() +
//                '}';
//    }
//}
