package com.gabriellcosta.financetest.util;

import android.content.Context;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class FileReaderUtil {

    private FileReaderUtil(){}

    public static <T> T read(final Context context, final String fileName, final Class<T> clazz) {
        return new Gson().fromJson(readFile(context, fileName), clazz);
    }

    public static String readFile(final Context context, final String path) {
        StringBuilder total = new StringBuilder();
        try {
            InputStream stream = context.getAssets()
                    .open(path);

            BufferedReader r = new BufferedReader(new InputStreamReader(stream));
            String line;
            while ((line = r.readLine()) != null) {
                total.append(line).append('\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return total.toString();
    }

}
