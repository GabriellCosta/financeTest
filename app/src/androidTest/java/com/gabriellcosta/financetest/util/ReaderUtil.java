package com.gabriellcosta.financetest.util;


import android.support.test.InstrumentationRegistry;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class ReaderUtil {

  private ReaderUtil() {
  }
  
  public static <T> T read(final String fileName, final Class<T> clazz) {
    return new Gson().fromJson(readFile(fileName), clazz);
  }

  private static String readFile(final String file) {
    StringBuilder total = new StringBuilder();
    try {
      InputStream stream = InstrumentationRegistry.getContext().getAssets()
          .open("test/" + file);

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
