package com.swiftpass.isoservice.pojo;

/**
 * @Author: EdmanWang
 * @date: 2020/3/31 13:35
 */
public class Field {


    /**
     * 位图中域的索引值
     */
    private int bit;

    /**
     * 银联标准中定义的数据长度
     */
    private int len;

    /**
     * 长度类型 是否变长
     * 0:表示定长
     * 1：表示两位变长
     * 2：表示三位变长
     */
    private int variable;

    /**
     * 域对其方式
     */
    private int alignType;

    /**
     * 域补足字符
     */
    private int assist;

    /**
     * 数据类型
     */
    private int bitType;

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public int getAlignType() {
        return alignType;
    }

    public void setAlignType(int alignType) {
        this.alignType = alignType;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getBitType() {
        return bitType;
    }

    public void setBitType(int bitType) {
        this.bitType = bitType;
    }

    @Override
    public String toString() {
        return "Field{" +
                "bit=" + bit +
                ", len=" + len +
                ", variable=" + variable +
                ", alignType=" + alignType +
                ", assist=" + assist +
                ", bitType=" + bitType +
                '}';
    }
}
