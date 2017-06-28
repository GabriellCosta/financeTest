package com.gabriellcosta.financetest.service;

import android.content.Context;

import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.entity.ScreenVO;
import com.gabriellcosta.financetest.util.FileReaderUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.ref.WeakReference;
import java.util.List;

public class FileSystemService implements Service {

    private final WeakReference<Context> context;

    public FileSystemService(final Context context) {
        this.context = new WeakReference<>(context);
    }

    @SuppressWarnings("AnonymousInnerClassMayBeStatic")
    @Override public List<CellVO> fetchCell() {
        final JsonParser jsonParser = new JsonParser();
        final String readFile = FileReaderUtil.readFile(context.get(), "fixture/cells.json");
        final JsonElement cellElement = jsonParser.parse(readFile);
        return new Gson().fromJson(cellElement.getAsJsonObject().get("cells"),
                new TypeToken<List<CellVO>>() {
                }.getType());
    }

    @Override public ScreenVO getScreen() {
        return FileReaderUtil.read(context.get(), "fixture/fund.json", ScreenVO.class);
    }

}
