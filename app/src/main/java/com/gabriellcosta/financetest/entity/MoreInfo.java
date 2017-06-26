package com.gabriellcosta.financetest.entity;


import com.google.gson.annotations.SerializedName;

public final class MoreInfo {

  @SerializedName("month") private final MoreInfoItem month;
  @SerializedName("year") private final MoreInfoItem year;
  @SerializedName("12months") private final MoreInfoItem moths12;

  private MoreInfo(MoreInfoItem month, MoreInfoItem year,
      MoreInfoItem moths12) {
    this.month = month;
    this.year = year;
    this.moths12 = moths12;
  }

  public MoreInfoItem getMonth() {
    return month;
  }

  public MoreInfoItem getYear() {
    return year;
  }

  public MoreInfoItem getMoths12() {
    return moths12;
  }

  final class MoreInfoItem {
    @SerializedName("fund") private final double fund;
    @SerializedName("CDI") private final double cdi;

    private MoreInfoItem(double fund, double cdi) {
      this.fund = fund;
      this.cdi = cdi;
    }

    public double getFund() {
      return fund;
    }

    public double getCdi() {
      return cdi;
    }
  }

}
