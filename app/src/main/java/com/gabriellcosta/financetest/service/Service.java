package com.gabriellcosta.financetest.service;

import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.entity.ScreenVO;

import java.util.List;

public interface Service {

    List<CellVO> fetchCell();

    ScreenVO getScreen();

}
