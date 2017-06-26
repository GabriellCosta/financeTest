package com.gabriellcosta.financetest.entity;


import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class Graph {

  @SerializedName("CDI") private final List<Double> cdi;
  @SerializedName("fund") private final List<Integer> fund;
  @SerializedName("x") private final List<String> x;

  private Graph(List<Double> cdi, List<Integer> fund, List<String> x) {
    this.cdi = cdi;
    this.fund = fund;
    this.x = x;
  }

  public List<Double> getCdi() {
    return Collections.unmodifiableList(cdi);
  }

  public List<Integer> getFund() {
    return Collections.unmodifiableList(fund);
  }

  public List<String> getX() {
    return Collections.unmodifiableList(x);
  }
}
