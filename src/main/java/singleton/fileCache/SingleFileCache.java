package singleton.fileCache;


import singleton.model.AbstractFile;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by wzyoung on 2014/12/14.
 */
public class SingleFileCache {

    private static  AbstractFile file;

    private SingleFileCache(String fileName) {



    }

    private static Map<String, SingleFileCache> fileMap = new HashMap<String, SingleFileCache>();

    public static SingleFileCache getInstance(String fileName) {


        SingleFileCache instance = fileMap.get(fileName);


        if (null == instance) {

            file = new AbstractFile(fileName);

            instance = new SingleFileCache(fileName);
            fileMap.put(fileName, instance);
        }
        return instance;
    }


}
