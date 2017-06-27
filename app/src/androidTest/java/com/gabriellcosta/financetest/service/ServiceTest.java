package com.gabriellcosta.financetest.service;

import android.support.test.InstrumentationRegistry;

import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.entity.ScreenVO;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ServiceTest {

    private Service service;

    @Before public void setup() {
        service = new FileSystemService(InstrumentationRegistry.getTargetContext());
    }

    @Test public void fetchCell_ShouldReturn7() {
        final List<CellVO> cellVOs = service.fetchCell();
        assertNotNull(cellVOs);
        assertEquals(cellVOs.size(), 7);
    }

    @Test public void getScreen_ShouldNotBeNull() {
        final ScreenVO screen = service.getScreen();
        assertNotNull(screen);
    }

}