package com.cbfacademy;

import java.io.File;
import java.util.*;

public class FileExtension {
    // method
    public boolean check(String filename) throws FilenameException {
        // if filename is equal to null OR file name is empty throw new
        // FilenameExceptiomn
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("File name is null or is empty");
            // if file name ends with .java return true
        } else if (filename.endsWith(".java")) {
            return true;
            // else if file name doesnt end with java return false
        } else {
            return false;
        }

    }

    // map method
        public Map<String, Integer> map(List<String> filenames) {
             Map<String,Integer> resultMap = new HashMap<>();
             for (String filename : filenames) { //check each provided file's extension
            try {
                if (check(filename)){
                    resultMap.put(filename, 1); // return true/Map all .java files  1 when the file extension is .java
                } else {
                    resultMap.put(filename, 0); //return false/Map all non .java files 0 when the file extension is not .java
                }
            } catch (FilenameException e)  {
                resultMap.put(filename, -1); // Map -1 when an exception occurs or a file is empty. 
            }
       
            }
            return resultMap;
        }
    }
    