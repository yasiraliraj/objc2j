import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import ru.andremoniy.objctojavacnv.Convertor;

import java.io.IOException;

/**
 * User: Andremoniy
 * Date: 12.06.12
 * Time: 1:49
 */
public class TestConverter {

    @Test
    public void convert() throws IOException, RecognitionException {

        //new Preprocessor().preprocessFile(new ArrayList<Macros>(), "C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\drawing\\helpers\\DKDrawKitMacros.h");

        new Convertor().convert("C:\\Work\\igor\\dia\\diagrammix\\src\\");

//        ConvertorH.convert_h("C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\dataModel\\diagrammer\\adornment\\DiaConnectorSkinBuilder.h");
//        ConvertorM.convert_m("C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\dataModel\\diagrammer\\import\\DiaImportFromGraffle.m");

    }

    @Test
    public void convertCocotron() throws IOException, RecognitionException {

        new Convertor().convert("C:\\Work\\JavaCocoa\\src\\ru\\andremoniy\\cocoa\\");

    }

    @Test
    public void convertSingle() throws IOException, RecognitionException {

        //new Preprocessor().preprocessFile(new ArrayList<Macros>(), "C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\drawing\\helpers\\DKDrawKitMacros.h");


//        ConvertorH.convert_h("C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\dataModel\\diagrammer\\adornment\\DiaConnectorSkinBuilder.h");
//        ConvertorM.convert_m("C:\\Work\\igor\\dia\\diagrammix\\src\\ru\\diagrammix\\dataModel\\diagrammer\\import\\DiaImportFromGraffle.m");

    }

}
