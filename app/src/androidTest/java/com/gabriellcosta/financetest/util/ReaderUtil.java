package com.gabriellcosta.financetest.util;


import android.support.test.InstrumentationRegistry;

public final class ReaderUtil {

    private ReaderUtil() {
    }

    public static <T> T read(final String fileName, final Class<T> clazz) {
        return FileReaderUtil.read(InstrumentationRegistry.getContext(), "test/" + fileName, clazz);
    }

}
