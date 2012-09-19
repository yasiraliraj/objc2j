package ru.andremoniy.objctojavacnv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Macros;
import ru.andremoniy.objctojavacnv.antlr.Preprocessor;

import java.io.File;
import java.util.*;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:35
 */
public class Convertor {

    public static final Logger log = LoggerFactory.getLogger(Convertor.class);
    
    public static final boolean NOT_IFS = false;
    public static final boolean ONLY_IFS = true;

    public boolean preprocess(Context context, String rootPath, String path, List<String> processedImports, boolean onlyIfs) {
        Preprocessor preprocessor = new Preprocessor();
        File dir = new File(path);
        for (File f : dir.listFiles()) {
            if (!f.isDirectory()) {
                if (f.getName().endsWith(".m") || f.getName().endsWith(".h")) {
                    try {
                        boolean wasIfs = preprocessor.preprocessFile(context, f.getAbsolutePath(), processedImports, onlyIfs, rootPath);
                        if (wasIfs) return true;
                    } catch (Exception e) {
                        // TODO: use Logger !!!
                        log.info("Failed to preprocess file: " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            } else {
                preprocess(context, rootPath, f.getAbsolutePath(), processedImports, onlyIfs);
                log.info(f.getAbsolutePath() + " preprocessed...");
            }
        }
        return false;
    }

    public void convert(String path) {
        Context context = new Context();

        List<String> processedImports = new ArrayList<>();
        do {
            preprocess(context, path, path, processedImports, NOT_IFS);
            //preprocess(macrosMap, path, processedImports, ONLY_IFS);
        } while (preprocess(context, path, path, processedImports, ONLY_IFS));

        // add special macroses:
        // todo: customization
        context.macrosMap.put("AVAILABLE_MAC_OS_X_VERSION_10_5_AND_LATER", Arrays.asList(new Macros("AVAILABLE_MAC_OS_X_VERSION_10_5_AND_LATER", "")));
        context.macrosMap.put("AVAILABLE_MAC_OS_X_VERSION_10_6_AND_LATER", Arrays.asList(new Macros("AVAILABLE_MAC_OS_X_VERSION_10_6_AND_LATER", "")));

        convertInternal(context, path, 0); // конвертируем сначала header файлы
        convertInternal(context, path, 1); // конвертируем m-файлы
    }

    private void convertInternal(Context context, String path, int whatConvert) {
        File dir = new File(path);
        List<File> files = new ArrayList<>(Arrays.asList(dir.listFiles()));

        // сначала header файлы
        if (whatConvert == 0) {
            for (File f : files) {
                if (f.getName().contains("+")) {
                    log.info(f.getAbsolutePath() + " skipped due to '+' in name...");
                    continue;
                }
                if (f.getName().endsWith(".h")) {
                    try {
                        log.info(f.getAbsolutePath() + " converting...");
                        ConvertorH.convert_h(f.getAbsolutePath(), context, null, null);
                        log.info(f.getAbsolutePath() + " converted...");
                    } catch (Exception e) {
                        log.info("Error converting " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            }
        } else {
            // потом m файлы
            for (File f : files) {
                if (f.getName().contains("+")) {
                    log.info(f.getAbsolutePath() + " skipped due to '+' in name...");
                    continue;
                }
                if (f.getName().endsWith(".m")) {
                    try {
                        log.info(f.getAbsolutePath() + " converting...");
                        ConvertorM.convert_m(f.getAbsolutePath(), context, new StringBuilder());
                        log.info(f.getAbsolutePath() + " converted...");
                    } catch (Exception e) {
                        log.info("Error converting " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            }
        }

        // ну и каталоги
        for (File f : files) {
            if (f.isDirectory()) {
                convertInternal(context, f.getAbsolutePath(), whatConvert);
                log.info(f.getAbsolutePath() + " converted...");
            }
        }

    }
}
