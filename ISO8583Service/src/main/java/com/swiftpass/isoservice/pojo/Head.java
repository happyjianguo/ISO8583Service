package com.swiftpass.isoservice.pojo;

/**
 * @Author: EdmanWang
 * @date: 2020/3/31 13:50
 */
public class Head {

    private String headerLength;
    private String headerFlagAndVersion;
    private String totalMessageLength;
    private String destinationID;
    private String sourceID;
    private String Reserved;
    private String batchNo;
    private String transInfo;
    private String userInfo;
    private String rejectCode;

    public String getHeaderLength() {
        return headerLength;
    }

    public void setHeaderLength(String headerLength) {
        this.headerLength = headerLength;
    }

    public String getHeaderFlagAndVersion() {
        return headerFlagAndVersion;
    }

    public void setHeaderFlagAndVersion(String headerFlagAndVersion) {
        this.headerFlagAndVersion = headerFlagAndVersion;
    }

    public String getTotalMessageLength() {
        return totalMessageLength;
    }

    public void setTotalMessageLength(String totalMessageLength) {
        this.totalMessageLength = totalMessageLength;
    }

    public String getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(String destinationID) {
        this.destinationID = destinationID;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getReserved() {
        return Reserved;
    }

    public void setReserved(String reserved) {
        Reserved = reserved;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(String transInfo) {
        this.transInfo = transInfo;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    @Override
    public String toString() {
        return "Head{" +
                "headerLength='" + headerLength + '\'' +
                ", headerFlagAndVersion='" + headerFlagAndVersion + '\'' +
                ", totalMessageLength='" + totalMessageLength + '\'' +
                ", destinationID='" + destinationID + '\'' +
                ", sourceID='" + sourceID + '\'' +
                ", Reserved='" + Reserved + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", transInfo='" + transInfo + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", rejectCode='" + rejectCode + '\'' +
                '}';
    }
}
