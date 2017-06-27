package com.gabriellcosta.financetest.entity;


import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class ScreenVO {

  @SerializedName("title") private final String title;
  @SerializedName("fundName") private final String fundName;
  @SerializedName("whatIs") private final String whatIs;
  @SerializedName("definition") private final String definition;
  @SerializedName("graph") private final Graph graph;
  @SerializedName("riskTitle") private final String riskTitle;
  @SerializedName("risk") private final int risk;
  @SerializedName("infoTitle") private final String infoTitle;
  @SerializedName("moreInfo") private final MoreInfo moreInfo;
  @SerializedName("info") private final List<Info> info = null;
  @SerializedName("downInfo") private final List<DownInfo> downInfo = null;

  private ScreenVO(String title, String fundName, String whatIs, String definition,
      Graph graph, String riskTitle, int risk, String infoTitle, MoreInfo moreInfo) {
    this.title = title;
    this.fundName = fundName;
    this.whatIs = whatIs;
    this.definition = definition;
    this.graph = graph;
    this.riskTitle = riskTitle;
    this.risk = risk;
    this.infoTitle = infoTitle;
    this.moreInfo = moreInfo;
  }

  public String getTitle() {
    return title;
  }

  public String getFundName() {
    return fundName;
  }

  public String getWhatIs() {
    return whatIs;
  }

  public String getDefinition() {
    return definition;
  }

  public Graph getGraph() {
    return graph;
  }

  public String getRiskTitle() {
    return riskTitle;
  }

  public int getRisk() {
    return risk;
  }

  public String getInfoTitle() {
    return infoTitle;
  }

  public MoreInfo getMoreInfo() {
    return moreInfo;
  }

  public List<Info> getInfo() {
    return Collections.unmodifiableList(info);
  }

  public List<DownInfo> getDownInfo() {
    return Collections.unmodifiableList(downInfo);
  }
}
